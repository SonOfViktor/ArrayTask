package com.fairycompany.arrays.action.impl;

import com.fairycompany.arrays.action.NumberArraySearch;
import com.fairycompany.arrays.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArraySearch implements NumberArraySearch {
    private static Logger logger = LogManager.getLogger();

    @Override
    public int searchMinElement(CustomArray customArray) {
        int minElement = customArray.getElement(0);

        for (int element : customArray.getArray()) {
            minElement = (minElement < element) ? minElement : element;
        }

        logger.info("Min element = " + minElement);

        return minElement;
    }

    @Override
    public int searchMaxElement(CustomArray customArray) {
        int maxElement = customArray.getElement(0);

        for (int element : customArray.getArray()) {
            maxElement = Math.max(maxElement, element);
        }

        logger.info("Max element = " + maxElement);

        return maxElement;
    }

}