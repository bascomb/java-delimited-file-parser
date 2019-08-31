package com.bascomb.integration;

import com.bascomb.App;
import com.bascomb.FileParsingException;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Integration {
    /**
     * Test no argument provided throughs excpetion
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNoArgument() throws IOException {
        App.main(new String[0]);
    }


    /**
     * Test path throws file not found exception when file cannot be found.
     */
    @Test(expected = FileNotFoundException.class)
    public void testInvalidFile() throws IOException {
        App.main(new String[] {"invalidpath.csv"});
    }
}
