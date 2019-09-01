package com.bascomb.integration;

import com.bascomb.App;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.fail;

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
    public void testFileNotFound() throws IOException {
        App.main(new String[] {"invalidpath.csv"});
    }

    /**
     * Delimiter can't be determined
     */
    @Test
    public void testDelimiterUndetermined() throws IOException {
        fail("Not yet implemented");
    }

    /**
     * File is empty.
     */
    @Test
    public void testEmptyFile() throws IOException {
        fail("Not yet implemented");
    }

    /**
     * End of File Reached
     */
    @Test
    public void testEOF() {
        fail("Not yet implemented");
    }


}
