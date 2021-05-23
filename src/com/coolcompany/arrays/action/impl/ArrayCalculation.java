package com.coolcompany.arrays.action.impl;

import com.coolcompany.arrays.action.Calculation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayCalculation implements Calculation {
    static Logger logger = LogManager.getLogger();

    @Override
    public double calculateAverageValue(int[] array) {
        double average = (double) calculateSumOfElement(array) / array.length;

        logger.info("Average value = " + average);

        return average;
    }

    @Override
    public int calculateSumOfElement(int[] array) {
        int sum = 0;

        for (int element : array) {
            sum += element;
        }

        logger.info("Sum = " + sum);

        return sum;
    }

    @Override
    public int calculatePositiveElements(int[] array) {
        int amountPositiveElements = 0;

        for (int element : array) {
            if (element > 0) {
                amountPositiveElements++;
            }
        }

        logger.info("Amount positive elements = " + amountPositiveElements);

        return amountPositiveElements;
    }

    @Override
    public int calculateNegativeElements(int[] array) {
        int amountNegativeElements = 0;

        for (int element : array) {
            if (element < 0) {
                amountNegativeElements++;
            }
        }

        logger.info("Amount negative elements = " + amountNegativeElements);

        return amountNegativeElements;
    }

}
