package com.fairycompany.arrays.action.impl;

import com.fairycompany.arrays.action.NumberArraySearch;
import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.ArrayTaskException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomArraySearch implements NumberArraySearch {
    private static Logger logger = LogManager.getLogger();
    private static final String NULL_MESSAGE = "Given CustomArray is null";

    @Override
    public int searchMinElement(CustomArray customArray) throws ArrayTaskException {
        if (customArray == null) {
            throw new ArrayTaskException(NULL_MESSAGE);
        }

        int minElement = customArray.getElement(0);

        for (int element : customArray.getArray()) {
            minElement = Math.min(minElement, element);
        }

        logger.info("Min element = {}", minElement);

        return minElement;
    }

    @Override
    public int searchMaxElement(CustomArray customArray) throws ArrayTaskException {
        if (customArray == null) {
            throw new ArrayTaskException(NULL_MESSAGE);
        }

        int maxElement = customArray.getElement(0);

        for (int element : customArray.getArray()) {
            maxElement = Math.max(maxElement, element);
        }

        logger.info("Max element = {}", maxElement);

        return maxElement;
    }

    @Override
    public int searchMinElementStream(CustomArray customArray) throws ArrayTaskException {
        if (customArray == null) {
            throw new ArrayTaskException(NULL_MESSAGE);
        }

        int minElement = Arrays.stream(customArray.getArray()).min().getAsInt();

        logger.info("Min element = {}", minElement);

        return minElement;
    }

    @Override
    public int searchMaxElementStream(CustomArray customArray) throws ArrayTaskException {
        if (customArray == null) {
            throw new ArrayTaskException(NULL_MESSAGE);
        }

        int maxElement = Arrays.stream(customArray.getArray()).max().getAsInt();

        logger.info("Max element = {}", maxElement);

        return maxElement;
    }
}
