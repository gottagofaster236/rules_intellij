package com.google.idea.testing;

import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestPlan;

public class IntellijJunit5TestExecutionListener implements TestExecutionListener {

    private static boolean isExecuted = false;

    @Override
    public void testPlanExecutionStarted(TestPlan testPlan) {
        if (!isExecuted) {
            isExecuted = true;
            BlazeTestSystemProperties.configureSystemProperties();
        }
    }
}
