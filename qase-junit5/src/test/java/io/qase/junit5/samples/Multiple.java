package io.qase.junit5.samples;

import io.qase.api.annotation.QaseId;
import io.qase.junit5.samples.Steps.Steps;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;


public class Multiple {
    @Test
    @QaseId(123)
    public void failedWithStepsTest() {
        Steps steps = new Steps();
        steps.successStep();
        steps.failureStep();
    }

    @Test
    @QaseId(456)
    public void passedWithStepsTest() {
        Steps steps = new Steps();
        steps.successStep();
    }

    @Test
    @QaseId(321)
    public void failedTest() throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        throw new AssertionError("Error message");
    }
}
