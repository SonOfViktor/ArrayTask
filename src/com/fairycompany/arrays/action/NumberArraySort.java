package com.fairycompany.arrays.action;

import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.ArrayTaskException;

public interface NumberArraySort {

    void selectionSort(CustomArray customArray) throws ArrayTaskException;

    void bubbleSort(CustomArray customArray) throws ArrayTaskException;

    void shuttleSort(CustomArray customArray) throws ArrayTaskException;
}
