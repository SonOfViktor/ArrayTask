package com.fairycompany.arrays.action;

import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.ArrayTaskException;

public interface NumberArrayReplacement {

    void replaceOddIndexWithNumber(CustomArray customArray, int number) throws ArrayTaskException;

    void replaceEvenIndexWithNumberStream(CustomArray customArray, int number) throws ArrayTaskException;

}
