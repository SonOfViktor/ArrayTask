package com.fairycompany.arrays.action.impl;

import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.ArrayTaskException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomArrayCalculationTest {

    CustomArray customArray;
    CustomArrayCalculation customArrayCalculation;

    @BeforeClass
    public void setUp() throws ArrayTaskException {
        customArrayCalculation = new CustomArrayCalculation();
        customArray = new CustomArray(1, -13, 2, 10, 5, 5, 0, -3, 6, 7);
    }

    @Test(description = "Check sum of CustomArray elements")
    public void testCalculateSumOfElement() throws ArrayTaskException {
        int actual = customArrayCalculation.calculateSumOfElement(customArray);
        int expected = 20;
        assertEquals(actual, expected);
    }

    @Test(description = "Check average value of CustomArray")
    public void testCalculateAverageValue() throws ArrayTaskException {
        double actual = customArrayCalculation.calculateAverageValue(customArray);
        double expected = 2.0;
        assertEquals(actual, expected, 0.001);
    }

    @Test(description = "Check amount of positive CustomArray elements")
    public void testCalculatePositiveElements() throws ArrayTaskException {
        int actual = customArrayCalculation.calculatePositiveElements(customArray);
        int expected = 7;
        assertEquals(actual, expected);
    }

    @Test(description = "Check amount of negative CustomArray elements")
    public void testCalculateNegativeElements() throws ArrayTaskException {
        int actual = customArrayCalculation.calculateNegativeElements(customArray);
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test(description = "Check sum of CustomArray elements with stream")
    public void testCalculateSumOfElementStream() throws ArrayTaskException {
        int actual = customArrayCalculation.calculateSumOfElementStream(customArray);
        int expected = 20;
        assertEquals(actual, expected);
    }

    @Test(description = "Check average value of CustomArray with stream")
    public void testCalculateAverageValueStream() throws ArrayTaskException {
        double actual = customArrayCalculation.calculateAverageValueStream(customArray);
        double expected = 2.0;
        assertEquals(actual, expected, 0.001);
    }

    @Test(description = "Check amount of positive CustomArray elements with stream")
    public void testCalculatePositiveElementsStream() throws ArrayTaskException {
        long actual = customArrayCalculation.calculatePositiveElementsStream(customArray);
        long expected = 7;
        assertEquals(actual, expected);
    }

    @Test(description = "Check amount of negative CustomArray elements")
    public void testCalculateNegativeElementsStream() throws ArrayTaskException {
        long actual = customArrayCalculation.calculateNegativeElementsStream(customArray);
        long expected = 2;
        assertEquals(actual, expected);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testCalculateSumOfElementException() throws ArrayTaskException {
        customArrayCalculation.calculateSumOfElement(null);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testCalculateAverageValueException() throws ArrayTaskException {
        customArrayCalculation.calculateAverageValue(null);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testCalculatePositiveElementsException() throws ArrayTaskException {
        customArrayCalculation.calculatePositiveElements(null);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testCalculateNegativeElementsException() throws ArrayTaskException {
        customArrayCalculation.calculateNegativeElements(null);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testCalculateSumOfElementStreamException() throws ArrayTaskException {
        customArrayCalculation.calculateSumOfElementStream(null);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testCalculateAverageValueStreamException() throws ArrayTaskException {
        customArrayCalculation.calculateAverageValueStream(null);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testCalculatePositiveElementsStreamException() throws ArrayTaskException {
        customArrayCalculation.calculatePositiveElementsStream(null);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testCalculateNegativeElementsStreamException() throws ArrayTaskException {
        customArrayCalculation.calculateNegativeElementsStream(null);
    }
}