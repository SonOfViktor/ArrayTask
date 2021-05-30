package com.fairycompany.arrays.parser;

import com.fairycompany.arrays.exception.ArrayTaskException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class ArrayTaskParserTest {

    ArrayTaskParser arrayTaskParser;
    List<String> stringList;
    List<int[]> arrayList;

    @BeforeClass
    public void setUp() throws ArrayTaskException {
        arrayTaskParser = new ArrayTaskParser();
        stringList = new ArrayList<>();
        stringList.add("2 -70 51 -85 90 -72 18 71 2 0");
        stringList.add("-3 d8 22 11");
        stringList.add("8");
        stringList.add("");
        stringList.add("1   -2  3   10   -4");
        arrayList = arrayTaskParser.parseStringListToArray(stringList);
    }

    @Test(description = "Check string with numbers parses to int[]")
    public void testParseNumberStringToArray() {
        int[] actual = arrayList.get(0);
        int[] expected = {2, -70, 51, -85, 90, -72, 18, 71, 2, 0};
        assertEquals(actual, expected);
    }

    @Test(description = "Check incorrect string parses to int[] and with one char")
    public void testParseNotNumberStringToArray() {
        int[] actual = arrayList.get(1);
        int[] expected = {8};
        assertEquals(actual, expected);
    }

    @Test(description = "Check empty string and with many spaces between numbers parses to int[]")
    public void testParseSpaceStringToArray() {
        int[] actual = arrayList.get(2);
        int[] expected = {1, -2, 3, 10, -4};
        assertEquals(actual, expected);
    }

    @Test(description = "ArrayTaskException is called if given list is null",
            expectedExceptions = ArrayTaskException.class)
    public void parseStringListToArrayNullException() throws ArrayTaskException {
        arrayTaskParser.parseStringListToArray(null);
    }

    @Test(description = "ArrayTaskException is called if given list is empty",
            expectedExceptions = ArrayTaskException.class)
    public void parseStringListToArrayEmptyException() throws ArrayTaskException {
        List<String> emptyList = new ArrayList<>();
        arrayTaskParser.parseStringListToArray(emptyList);
    }
}