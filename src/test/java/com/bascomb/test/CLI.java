package com.bascomb.test;

import com.bascomb.application.App;
import org.junit.Test;

import java.io.IOException;

public class CLI {
    /**
     * Test no argument provided throws excpetion
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNoArgument() throws IOException {
        App.main(new String[0]);
    }

}
