package com.fairycompany.arrays.action.impl;

import com.fairycompany.arrays.action.Search;
import com.fairycompany.arrays.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySearch implements Search {
    static Logger logger = LogManager.getLogger();

    @Override
    public int searchMinElement(CustomArray customArray) {
        int minElement = customArray.getArrayElement(0);

        for (int element : customArray.getArray()) {
            minElement = (minElement < element) ? minElement : element;
        }

        logger.info("Min element = " + minElement);

        return minElement;
    }

    @Override
    public int searchMaxElement(CustomArray customArray) {
        int maxElement = customArray.getArrayElement(0);

        for (int element : customArray.getArray()) {
            maxElement = Math.max(maxElement, element);
        }

        logger.info("Max element = " + maxElement);

        return maxElement;
    }

}
