package com.fairycompany.arrays.action.impl;

import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.ArrayTaskException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomArraySortTest {

    CustomArray customArray;
    CustomArraySort customArraySort;
    CustomArray expected;

    @BeforeMethod
    public void setUp() throws ArrayTaskException {
        customArray = new CustomArray(5, -13, 2, 10, -108, 5, 0, -3, 6, 83);
        customArraySort = new CustomArraySort();
        expected = new CustomArray(-108, -13, -3, 0, 2, 5, 5, 6, 10, 83);
    }

    @Test(description = "Check selection sort work")
    public void testSelectionSort() throws ArrayTaskException {
        customArraySort.selectionSort(customArray);
        assertEquals(customArray, expected);
    }

    @Test(description = "Check bubble sort work")
    public void testBubbleSort() throws ArrayTaskException {
        customArraySort.bubbleSort(customArray);
        assertEquals(customArray, expected);
    }

    @Test(description = "Check shuttle sort work")
    public void testShuttleSort() throws ArrayTaskException {
        customArraySort.shuttleSort(customArray);
        assertEquals(customArray, expected);
    }

    @Test(description = "Check sort in class Stream sort work")
    public void testStreamSort() throws ArrayTaskException {
        customArraySort.streamSort(customArray);
        assertEquals(customArray, expected);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testSelectionSortException() throws ArrayTaskException {
        customArraySort.selectionSort(null);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testBubbleSortException() throws ArrayTaskException {
        customArraySort.bubbleSort(null);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testShuttleSortException() throws ArrayTaskException {
        customArraySort.shuttleSort(null);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testStreamSortException() throws ArrayTaskException {
        customArraySort.streamSort(null);
    }
}