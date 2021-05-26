package com.fairycompany.arrays.action;

import com.fairycompany.arrays.entity.CustomArray;

public interface NumberArrayCalculation {

    double calculateAverageValue(CustomArray customArray);

    int calculateSumOfElement(CustomArray customArray);

    int calculatePositiveElements(CustomArray customArray);

    int calculateNegativeElements(CustomArray customArray);

}
