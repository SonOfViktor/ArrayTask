package com.fairycompany.arrays.action.impl;

import com.fairycompany.arrays.action.NumberArrayCalculation;
import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.ArrayTaskException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomArrayCalculation implements NumberArrayCalculation {
    private static Logger logger = LogManager.getLogger();

    @Override
    public int calculateSumOfElement(CustomArray customArray) throws ArrayTaskException {
        if (customArray == null) {
            throw new ArrayTaskException("Given CustomArray is null");
        }

        int sum = 0;

        for (int element : customArray.getArray()) {
            sum += element;
        }

        logger.info("Sum = " + sum);

        return sum;
    }

    @Override
    public double calculateAverageValue(CustomArray customArray) throws ArrayTaskException {
        if (customArray == null) {
            throw new ArrayTaskException("Given CustomArray is null");
        }

        double average = (double) calculateSumOfElement(customArray) / customArray.getArray().length;

        logger.info("Average value = " + average);

        return average;
    }

    @Override
    public int calculatePositiveElements(CustomArray customArray) throws ArrayTaskException {
        if (customArray == null) {
            throw new ArrayTaskException("Given CustomArray is null");
        }

        int amountPositiveElements = 0;

        for (int element : customArray.getArray()) {
            if (element > 0) {
                amountPositiveElements++;
            }
        }

        logger.info("Amount positive elements = " + amountPositiveElements);

        return amountPositiveElements;
    }

    @Override
    public int calculateNegativeElements(CustomArray customArray) throws ArrayTaskException {
        if (customArray == null) {
            throw new ArrayTaskException("Given CustomArray is null");
        }

        int amountNegativeElements = 0;

        for (int element : customArray.getArray()) {
            if (element < 0) {
                amountNegativeElements++;
            }
        }

        logger.info("Amount negative elements = " + amountNegativeElements);

        return amountNegativeElements;
    }

    @Override
    public int calculateSumOfElementStream(CustomArray customArray) throws ArrayTaskException {
        if (customArray == null) {
            throw new ArrayTaskException("Given CustomArray is null");
        }

        int sum = Arrays.stream(customArray.getArray()).sum();

        logger.info("Sum = " + sum);

        return sum;
    }

    @Override
    public double calculateAverageValueStream(CustomArray customArray) throws ArrayTaskException {
        if (customArray == null) {
            throw new ArrayTaskException("Given CustomArray is null");
        }

        double average = Arrays.stream(customArray.getArray()).average().orElse(0);

        logger.info("Average value = " + average);

        return average;
    }

    @Override
    public long calculatePositiveElementsStream(CustomArray customArray) throws ArrayTaskException {
        if (customArray == null) {
            throw new ArrayTaskException("Given CustomArray is null");
        }

        long amountPositiveElements = Arrays.stream(customArray.getArray()).filter(x -> (x > 0)).count();

        logger.info("Amount positive elements = " + amountPositiveElements);

        return amountPositiveElements;
    }

    @Override
    public long calculateNegativeElementsStream(CustomArray customArray) throws ArrayTaskException {
        if (customArray == null) {
            throw new ArrayTaskException("Given CustomArray is null");
        }

        long amountNegativeElements = Arrays.stream(customArray.getArray()).filter(x -> (x < 0)).count();

        logger.info("Amount negative elements = " + amountNegativeElements);

        return amountNegativeElements;
    }
}
