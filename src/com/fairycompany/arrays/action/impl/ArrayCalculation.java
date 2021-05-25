package com.fairycompany.arrays.action.impl;

import com.fairycompany.arrays.action.Calculation;
import com.fairycompany.arrays.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayCalculation implements Calculation {
    static Logger logger = LogManager.getLogger();

    @Override
    public double calculateAverageValue(CustomArray customArray) {
        double average = (double) calculateSumOfElement(customArray) / customArray.getArray().length;

        logger.info("Average value = " + average);

        return average;
    }

    @Override
    public int calculateSumOfElement(CustomArray customArray) {
        int sum = 0;

        for (int element : customArray.getArray()) {
            sum += element;
        }

        logger.info("Sum = " + sum);

        return sum;
    }

    @Override
    public int calculatePositiveElements(CustomArray customArray) {
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
    public int calculateNegativeElements(CustomArray customArray) {
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
