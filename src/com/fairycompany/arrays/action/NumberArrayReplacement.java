package com.fairycompany.arrays.action;

import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.ArrayTaskException;

public interface NumberArrayReplacement {

    int replaceOddIndexWithNumber(CustomArray customArray, int number) throws ArrayTaskException;

    int replaceEvenIndexWithNumberStream(CustomArray customArray, int number) throws ArrayTaskException;

}
