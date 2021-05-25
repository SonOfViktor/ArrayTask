package com.fairycompany.arrays.action.impl;

import com.fairycompany.arrays.action.Replacement;
import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.CustomArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayReplace implements Replacement {
    private static Logger logger = LogManager.getLogger();

    @Override
    public void replaceOddElementsWithN(CustomArray customArray, int n) throws CustomArrayException {

        for (int i = 0; i < customArray.getArray().length; i++) {
            if (i % 2 > 0) {
                customArray.setArrayElement(i, n);
            }
        }

        logger.info("Replaced array is " + customArray.toString());

    }

}
