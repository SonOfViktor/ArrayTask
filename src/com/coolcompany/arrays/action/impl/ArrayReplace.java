package com.coolcompany.arrays.action.impl;

import com.coolcompany.arrays.action.Replacement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayReplace implements Replacement {
    static Logger logger = LogManager.getLogger();

    @Override
    public int[] replaceOddElementsWithOne(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (i % 2 > 0) {
                array[i] = 1;
            }
        }

        logger.info("Replaced array is " + Arrays.toString(array));

        return array;

    }

}
