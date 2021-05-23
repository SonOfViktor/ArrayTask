package com.coolcompany.arrays.action.impl;

import com.coolcompany.arrays.action.Search;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayMinMax implements Search {
    static Logger logger = LogManager.getLogger();

    @Override
    public int searchMinElement(int[] array) {
        int minElement = array[0];

        for (int element : array) {
            minElement = (minElement < element) ? minElement : element;
        }

        logger.info("Min element = " + minElement);

        return minElement;
    }

    @Override
    public int searchMaxElement(int[] array) {
        int maxElement = array[0];

        for (int element : array) {
            maxElement = Math.max(maxElement, element);
        }

        logger.info("Max element = " + maxElement);

        return maxElement;
    }

}
