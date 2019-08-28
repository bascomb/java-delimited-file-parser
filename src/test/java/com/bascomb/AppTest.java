package com.bascomb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    File file = new File("src/main/resources/test-tab-delimited-file.tab");
    /**
     * test-tab-delimited-file.tab
     */
    @Test
    public void testTabDelimitedFile() throws IOException {
        System.out.println(file.toPath());
        List<String> lines = FileUtils.readLines(file, "UTF-8");
        List<String> expectedLines = new ArrayList<String>();
        expectedLines.add("This    is  a   test");
        expectedLines.add("This    is  also    a   test");
        for(int i = 0; i < lines.size(); i++) {
            assertEquals(lines.get(i), expectedLines.get(i));
        }
    }
}
