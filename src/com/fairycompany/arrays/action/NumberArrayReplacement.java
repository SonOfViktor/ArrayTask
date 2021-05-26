package com.fairycompany.arrays.action;

import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.CustomArrayException;

public interface NumberArrayReplacement {

    void replaceOddElementsWithN(CustomArray customArray, int n) throws CustomArrayException;

}
