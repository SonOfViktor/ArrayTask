package com.fairycompany.arrays.action.impl;

import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.ArrayTaskException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomArrayReplaceTest {

    CustomArrayReplace customArrayReplace;

    @BeforeClass
    public void setUp() throws ArrayTaskException {
        customArrayReplace = new CustomArrayReplace();
    }

    @Test
    public void testReplaceOddElementsWithNumber() throws ArrayTaskException {
        CustomArray actual = new CustomArray(9, 8, 20, -453, 800, 0, 21);
        customArrayReplace.replaceOddElementsWithNumber(actual, 10);
        CustomArray expectedCustomArray = new CustomArray(9, 10, 20, 10, 800, 10, 21);
        assertEquals(actual, expectedCustomArray);
    }

    @Test (description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testReplaceOddElementWithNumber() throws ArrayTaskException {
        customArrayReplace.replaceOddElementsWithNumber(null, 10);
    }
}