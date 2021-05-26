package com.fairycompany.arrays.action.impl;

import com.fairycompany.arrays.action.NumberArraySort;
import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.CustomArrayException;
import com.fairycompany.arrays.validator.ArrayTaskValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArraySort implements NumberArraySort {
    static Logger logger = LogManager.getLogger();

    public void selectionSort(CustomArray customArray) throws CustomArrayException {
        if (ArrayTaskValidator.isCustomArrayNull(customArray)) {
            throw new CustomArrayException("Given customArray is null");
        }

        if (customArray.getLength() != 1) {
            for (int i = 0; i < customArray.getLength(); i++) {
                int minIndex = i;
                for (int j = i; j < customArray.getLength(); j++) {
                    if (customArray.getElement(j) < customArray.getElement(minIndex)) {
                        minIndex = j;
                    }
                }
                swapElement(customArray, i, minIndex);
            }
        }

        logger.info(customArray.toString());
    }

    private void swapElement(CustomArray customArray, int firstElement, int secondElement)
            throws CustomArrayException {
        int temp = customArray.getElement(firstElement);
        customArray.setElement(firstElement, customArray.getElement(secondElement));
        customArray.setElement(secondElement, temp);
    }
}
