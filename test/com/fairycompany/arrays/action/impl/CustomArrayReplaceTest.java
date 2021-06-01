package com.fairycompany.arrays.action.impl;

import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.ArrayTaskException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomArrayReplaceTest {

    CustomArrayReplace customArrayReplace;

    @BeforeMethod
    public void setUp() throws ArrayTaskException {
        customArrayReplace = new CustomArrayReplace();
    }

    @Test
    public void testReplaceOddIndexWithNumber() throws ArrayTaskException {
        CustomArray actual = new CustomArray(9, 8, 20, -453, 800, 0, 21);
        customArrayReplace.replaceOddIndexWithNumber(actual, 10);
        CustomArray expectedCustomArray = new CustomArray(9, 10, 20, 10, 800, 10, 21);
        assertEquals(actual, expectedCustomArray);
    }

    @Test
    public void testReplaceEvenIndexWithNumberStream() throws ArrayTaskException {
        CustomArray actual = new CustomArray(9, 8, 20, -453, 800, 0, 21);
        customArrayReplace.replaceEvenIndexWithNumberStream(actual, 10);
        CustomArray expectedCustomArray = new CustomArray(10, 8, 10, -453, 10, 0, 10);
        assertEquals(actual, expectedCustomArray);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testReplaceOddIndexWithNumberException() throws ArrayTaskException {
        customArrayReplace.replaceOddIndexWithNumber(null, 10);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testReplaceEvenIndexWithNumberStreamException() throws ArrayTaskException {
        customArrayReplace.replaceEvenIndexWithNumberStream(null, 10);
    }
}