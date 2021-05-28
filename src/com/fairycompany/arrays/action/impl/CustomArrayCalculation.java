package com.fairycompany.arrays.action.impl;

import com.fairycompany.arrays.action.NumberArrayCalculation;
import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.ArrayTaskException;
import com.fairycompany.arrays.validator.ArrayTaskValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayCalculation implements NumberArrayCalculation {
    private static Logger logger = LogManager.getLogger();

    @Override
    public double calculateAverageValue(CustomArray customArray) throws ArrayTaskException {
        if (ArrayTaskValidator.isCustomArrayNull(customArray)) {
            throw new ArrayTaskException("Given CustomArray is null");
        }

        double average = (double) calculateSumOfElement(customArray) / customArray.getArray().length;

        logger.info("Average value = " + average);

        return average;
    }

    @Override
    public int calculateSumOfElement(CustomArray customArray) throws ArrayTaskException {
        if (ArrayTaskValidator.isCustomArrayNull(customArray)) {
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
    public int calculatePositiveElements(CustomArray customArray) throws ArrayTaskException {
        if (ArrayTaskValidator.isCustomArrayNull(customArray)) {
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
        if (ArrayTaskValidator.isCustomArrayNull(customArray)) {
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

}
