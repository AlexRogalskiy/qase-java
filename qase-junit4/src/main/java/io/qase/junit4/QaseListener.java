package io.qase.junit4;


import io.qase.api.StepStorage;
import io.qase.api.annotation.Qase;
import io.qase.api.config.QaseConfig;
import io.qase.api.services.QaseTestCaseListener;
import io.qase.api.utils.IntegrationUtils;
import io.qase.client.model.ResultCreate;
import io.qase.client.model.ResultCreate.StatusEnum;
import io.qase.client.model.ResultCreateStepsInner;
import io.qase.junit4.guice.module.Junit4Module;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

import java.util.LinkedList;
import java.util.Optional;

import static io.qase.api.utils.IntegrationUtils.getStacktrace;
import static io.qase.client.model.ResultCreate.StatusEnum.*;

@Slf4j
public class QaseListener extends RunListener {

    public static final String REPORTER_NAME = "JUnit 4";

    @Getter(lazy = true, value = AccessLevel.PRIVATE)
    private final QaseTestCaseListener qaseTestCaseListener = createQaseListener();

    static {
        System.setProperty(QaseConfig.QASE_CLIENT_REPORTER_NAME_KEY, REPORTER_NAME);
    }

    @Override
    public void testStarted(Description description) {
        getQaseTestCaseListener().onTestCaseStarted();
    }

    @Override
    public void testFinished(Description description) {
        getQaseTestCaseListener().onTestCaseFinished(
                resultCreate -> setupResultItem(resultCreate, description, PASSED, null)
        );
    }

    @Override
    public void testFailure(Failure failure) {
        getQaseTestCaseListener().onTestCaseFinished(
                resultCreate -> setupResultItem(resultCreate, failure.getDescription(), FAILED, failure.getException())
        );
    }

    @Override
    public void testAssumptionFailure(Failure failure) {
        getQaseTestCaseListener().onTestCaseFinished(
                resultCreate -> setupResultItem(resultCreate, failure.getDescription(), SKIPPED, null)
        );
    }

    @Override
    public void testIgnored(Description description) {
        getQaseTestCaseListener().onTestCaseFinished(
                resultCreate -> setupResultItem(resultCreate, description, SKIPPED, null)
        );
    }

    @Override
    public void testRunFinished(Result result) {
        getQaseTestCaseListener().onTestCasesSetFinished();
    }

    private ResultCreate setupResultItem(ResultCreate resultCreate, Description description, StatusEnum status, Throwable error) {
        Optional<Throwable> optionalThrowable = Optional.ofNullable(error);
        String comment = optionalThrowable
                .flatMap(throwable -> Optional.of(throwable.toString())).orElse(null);
        Boolean isDefect = optionalThrowable
                .flatMap(throwable -> Optional.of(throwable instanceof AssertionError))
                .orElse(false);
        String stacktrace = optionalThrowable
                .flatMap(throwable -> Optional.of(getStacktrace(throwable))).orElse(null);
        LinkedList<ResultCreateStepsInner> steps = StepStorage.stopSteps();
        if (description.getAnnotation(Qase.class) != null) {
            IntegrationUtils.enrichResult(resultCreate, description.getAnnotation(Qase.class));
        }
        return resultCreate
                .status(status)
                .comment(comment)
                .stacktrace(stacktrace)
                .steps(steps.isEmpty() ? null : steps)
                .defect(isDefect);
    }

    private static QaseTestCaseListener createQaseListener() {
        return Junit4Module.getInjector().getInstance(QaseTestCaseListener.class);
    }
}
