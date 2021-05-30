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

    @Test(description = "Check average value of CustomArray")
    public void testCalculateAverageValue() throws ArrayTaskException {
        double actual = customArrayCalculation.calculateAverageValue(customArray);
        double expected = 2.0;
        assertEquals(actual, expected, 0.001);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testCalculateAverageValueException() throws ArrayTaskException {
        customArrayCalculation.calculateAverageValue(null);
    }

    @Test(description = "Check sum of CustomArray elements")
    public void testCalculateSumOfElement() throws ArrayTaskException {
        int actual = customArrayCalculation.calculateSumOfElement(customArray);
        int expected = 20;
        assertEquals(actual, expected);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testCalculateSumOfElementException() throws ArrayTaskException {
        customArrayCalculation.calculateSumOfElement(null);
    }

    @Test(description = "Check amount of positive CustomArray elements")
    public void testCalculatePositiveElements() throws ArrayTaskException {
        int actual = customArrayCalculation.calculatePositiveElements(customArray);
        int expected = 7;
        assertEquals(actual, expected);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testCalculatePositiveElementsException() throws ArrayTaskException {
        customArrayCalculation.calculatePositiveElements(null);
    }

    @Test(description = "Check amount of negative CustomArray elements")
    public void testCalculateNegativeElements() throws ArrayTaskException {
        int actual = customArrayCalculation.calculateNegativeElements(customArray);
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testCalculateNegativeElementsException() throws ArrayTaskException {
        customArrayCalculation.calculateNegativeElements(null);
    }
}