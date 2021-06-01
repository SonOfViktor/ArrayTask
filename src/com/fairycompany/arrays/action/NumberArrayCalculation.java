package com.fairycompany.arrays.action;

import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.ArrayTaskException;

public interface NumberArrayCalculation {

    int calculateSumOfElement(CustomArray customArray) throws ArrayTaskException;

    double calculateAverageValue(CustomArray customArray) throws ArrayTaskException;

    int calculatePositiveElements(CustomArray customArray) throws ArrayTaskException;

    int calculateNegativeElements(CustomArray customArray) throws ArrayTaskException;

    int calculateSumOfElementStream(CustomArray customArray) throws ArrayTaskException;

    double calculateAverageValueStream(CustomArray customArray) throws ArrayTaskException;

    long calculatePositiveElementsStream(CustomArray customArray) throws ArrayTaskException;

    long calculateNegativeElementsStream(CustomArray customArray) throws ArrayTaskException;

}
