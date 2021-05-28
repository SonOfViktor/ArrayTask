package com.fairycompany.arrays.action;

import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.ArrayTaskException;

public interface NumberArrayCalculation {

    double calculateAverageValue(CustomArray customArray) throws ArrayTaskException;

    int calculateSumOfElement(CustomArray customArray) throws ArrayTaskException;

    int calculatePositiveElements(CustomArray customArray) throws ArrayTaskException;

    int calculateNegativeElements(CustomArray customArray) throws ArrayTaskException;

}
