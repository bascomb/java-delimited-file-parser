package com.bascomb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.bascomb.files.DelimitedFile;
import com.bascomb.files.Files;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    String path = "src/test/resources/test-space-delimited.fixed";
    /**
     * test-space-delimited.fixed
     */
    @Test
    public void testTabDelimitedFile() throws IOException {
        File file = new File("src/test/resources/test-space-delimited.fixed");
        System.out.println(file.toPath());
        List<String> lines = FileUtils.readLines(file, "UTF-8");
        List<String> expectedLines = new ArrayList<String>();
        expectedLines.add("This is a test");
        for(int i = 0; i < lines.size(); i++) {
            assertEquals(lines.get(i), expectedLines.get(i));
        }
    }

    @Test
    public void testReadLineMethod() {
        Files file = new DelimitedFile(this.path);
        String tokens[] = {"This", "is", "a", "test"};
        List<String> expectedTokens = Arrays.asList(tokens);
        List<String> actualTokens = file.readLine();
        System.out.println("Expected" + expectedTokens);
        System.out.println("Actual - " + actualTokens);

        assertEquals(expectedTokens, actualTokens);
    }

}
