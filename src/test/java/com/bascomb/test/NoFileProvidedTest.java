package com.bascomb.test;

import com.bascomb.application.AppConfig;
import org.junit.Test;

import java.io.IOException;

public class NoFileProvidedTest {
    /**
     * Test no argument provided throws excpetion
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNoArgument() throws IOException {
        AppConfig.main(new String[0]);
    }

}
