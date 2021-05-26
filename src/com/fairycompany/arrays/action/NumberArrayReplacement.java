package com.fairycompany.arrays.action;

import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.CustomArrayException;

public interface NumberArrayReplacement {

    void replaceOddElementsWithNumber(CustomArray customArray, int number) throws CustomArrayException;

}
