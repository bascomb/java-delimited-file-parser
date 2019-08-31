package com.bascomb;


import com.bascomb.files.DelimitedFile;
import com.bascomb.files.Files;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class TestExtensionMapping {

    private static final Map<String, String> extMap = new HashMap<String, String>();

    static {
        extMap.put("space", "src/test/resources/test-space-delimited.space");
    }

    @Test
    public void testTab() {
    fail("Not yet implemented");
    }

    @Test
    public void testCSV() {

        fail("Not yet implemented");   }

    @Test
    public void testPipe() {

        fail("Not yet implemented");   }

    @Test
    public void testFixed() {

        fail("Not yet implemented");    }

    @Test
    public void testSpace() throws IOException {
        Files file = new DelimitedFile(extMap.get("space"));
        String tokens[] = {"This", "is", "a", "test"};
        List<String> expectedTokens = Arrays.asList(tokens);
        List<String> actualTokens = file.readLine();
        System.out.println("Expected" + expectedTokens);
        System.out.println("Actual - " + actualTokens);

        assertEquals(expectedTokens, actualTokens);
    }

}
