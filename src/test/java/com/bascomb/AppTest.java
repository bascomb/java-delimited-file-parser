package com.bascomb;

import static org.junit.Assert.assertTrue;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    File testFile = new File("src/main/resources/test-tab-delimited-file.tab");
    /**
     * test-tab-delimited-file.tab
     */
    @Test
    public void testTabDelimitedFile() throws IOException {
        System.out.println(testFile.toPath());
        LineIterator it = FileUtils.lineIterator(testFile);
        while(it.hasNext()) {
            String line = it.nextLine();
            System.out.println(line);
        }
        assertTrue(true);
    }
}
