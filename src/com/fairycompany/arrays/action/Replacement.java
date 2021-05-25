package com.fairycompany.arrays.action;

import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.CustomArrayException;

public interface Replacement {

    void replaceOddElementsWithN (CustomArray customArray, int n) throws CustomArrayException;

}
