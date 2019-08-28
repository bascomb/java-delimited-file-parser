package com.bascomb;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.File;
import java.net.URL;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    URL url = this.getClass().getResource("/test-tab-delimited-file.tab");
    File testTabFile = new File(url.getFile());

    /**
     * test-tab-delimited-file.tab
     */
    @Test
    public void testTabDelimitedFile()
    {
        System.out.println(testTabFile.toPath());
        assertTrue(true);
    }
}
