package com.coolcompany.arrays.action.impl;

import com.coolcompany.arrays.action.Calculation;

public class ArrayCalculation implements Calculation {

    @Override
    public double calculateAverageElement(int[] array) {
        return (double) calculateSumOfElement(array) / array.length;
    }

    @Override
    public int calculateSumOfElement(int[] array) {
        int sum = 0;

        for (int element : array) {
            sum += element;
        }

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

        return amountPositiveElements;
    }

    @Override
    public int calculateNegativeElements(int[] array) {
        int amountNegativeElements = 0;

        for (int element : array) {
            if (element > 0) {
                amountNegativeElements++;
            }
        }

        return amountNegativeElements;
    }

}
