package com.coolcompany.arrays.action.impl;

import com.coolcompany.arrays.action.Replacement;

public class ArrayReplace implements Replacement {

    @Override
    public int[] replaceOddElementsWithOne(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (i % 2 > 0) {
                array[i] = 1;
            }
        }

        return array;
    }

}
