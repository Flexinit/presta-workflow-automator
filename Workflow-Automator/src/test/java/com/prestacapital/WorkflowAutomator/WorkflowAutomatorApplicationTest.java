package com.prestacapital.WorkflowAutomator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import springfox.documentation.spring.web.plugins.Docket;

class WorkflowAutomatorApplicationTest {
    /**
     * Method under test: {@link WorkflowAutomatorApplication.SpringFoxConfig#api()}
     */
    @Test
    void testSpringFoxConfigApi() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Diffblue AI was unable to find a test

        Docket actualApiResult = ((new WorkflowAutomatorApplication()).new SpringFoxConfig()).api();
        assertTrue(actualApiResult.isEnabled());
        assertEquals("default", actualApiResult.getGroupName());
    }

    /**
     * Method under test: {@link WorkflowAutomatorApplication.SpringFoxConfig#api()}
     */
    @Test
    void testSpringFoxConfigApi2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Diffblue AI was unable to find a test

        Docket actualApiResult = (mock(WorkflowAutomatorApplication.class).new SpringFoxConfig()).api();
        assertTrue(actualApiResult.isEnabled());
        assertEquals("default", actualApiResult.getGroupName());
    }
}

