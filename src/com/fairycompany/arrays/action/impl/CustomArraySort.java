package com.fairycompany.arrays.action.impl;

import com.fairycompany.arrays.action.NumberArraySort;
import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.ArrayTaskException;
import com.fairycompany.arrays.validator.ArrayTaskValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomArraySort implements NumberArraySort {
    static Logger logger = LogManager.getLogger();

    public void selectionSort(CustomArray customArray) throws ArrayTaskException {
        if (ArrayTaskValidator.isCustomArrayNull(customArray)) {
            throw new ArrayTaskException("Given customArray is null");
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

    public void bubbleSort(CustomArray customArray) throws ArrayTaskException {
        if (ArrayTaskValidator.isCustomArrayNull(customArray)) {
            throw new ArrayTaskException("Given customArray is null");
        }

        if (customArray.getLength() != 1) {
            for (int i = customArray.getLength() - 1; i >= 1; i--) {
                for (int j = 0; j < i; j++) {
                    if (customArray.getElement(j) > customArray.getElement(j + 1))
                        swapElement(customArray, j, j + 1);
                }
            }
        }

        logger.info(customArray.toString());
    }

    public void shuttleSort(CustomArray customArray) throws ArrayTaskException {
        if (ArrayTaskValidator.isCustomArrayNull(customArray)) {
            throw new ArrayTaskException("Given customArray is null");
        }

        for (int i = 1; i < customArray.getLength(); i++) {
            if (customArray.getElement(i) < customArray.getElement(i - 1)) {
                swapElement(customArray, i, i - 1);

                int j = i - 1;

                while (j - 1 >= 0) {
                    if (customArray.getElement(j) < customArray.getElement(j - 1)) {
                        swapElement(customArray, j, j - 1);
                        j--;
                    } else {
                        break;
                    }
                }
            }
        }

        logger.info(customArray.toString());
    }

    public void streamSort(CustomArray customArray) throws ArrayTaskException {
        if (ArrayTaskValidator.isCustomArrayNull(customArray)) {
            throw new ArrayTaskException("Given customArray is null");
        }

        customArray.setArray(Arrays.stream(customArray.getArray()).sorted().toArray());

        logger.info(customArray.toString());
    }

    private void swapElement(CustomArray customArray, int firstElement, int secondElement)
            throws ArrayTaskException {
        int temp = customArray.getElement(firstElement);
        customArray.setElement(firstElement, customArray.getElement(secondElement));
        customArray.setElement(secondElement, temp);
    }
}
