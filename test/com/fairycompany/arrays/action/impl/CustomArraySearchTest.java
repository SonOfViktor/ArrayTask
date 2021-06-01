package com.fairycompany.arrays.action.impl;

import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.ArrayTaskException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomArraySearchTest {

    CustomArray customArray;
    CustomArraySearch customArraySearch;

    @BeforeClass
    public void setUp() throws ArrayTaskException {
        customArraySearch = new CustomArraySearch();
        customArray = new CustomArray(9, 8, 20, -453, 800, 0, 21);

    }

    @Test(description = "Check min element of CustomArray")
    public void testSearchMinElement() throws ArrayTaskException {
        int actual = customArraySearch.searchMinElement(customArray);
        int expected = -453;
        assertEquals(actual, expected);
    }

    @Test(description = "Check max element of CustomArray")
    public void testSearchMaxElement() throws ArrayTaskException {
        int actual = customArraySearch.searchMaxElement(customArray);
        int expected = 800;
        assertEquals(actual, expected);
    }

    @Test(description = "Check min element of CustomArray with stream")
    public void testSearchMinElementStream() throws ArrayTaskException {
        int actual = customArraySearch.searchMinElementStream(customArray);
        int expected = -453;
        assertEquals(actual, expected);
    }

    @Test(description = "Check max element of CustomArray with stream")
    public void testSearchMaxElementStream() throws ArrayTaskException {
        int actual = customArraySearch.searchMaxElementStream(customArray);
        int expected = 800;
        assertEquals(actual, expected);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testSearchMinElementException() throws ArrayTaskException {
        customArraySearch.searchMinElement(null);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testSearchMaxElementException() throws ArrayTaskException {
        customArraySearch.searchMaxElement(null);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testSearchMinElementStreamException() throws ArrayTaskException {
        customArraySearch.searchMinElementStream(null);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testSearchMaxElementStreamException() throws ArrayTaskException {
        customArraySearch.searchMaxElementStream(null);
    }
}