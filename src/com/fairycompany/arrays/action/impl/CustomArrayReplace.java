package com.fairycompany.arrays.action.impl;

import com.fairycompany.arrays.action.NumberArrayReplacement;
import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.ArrayTaskException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CustomArrayReplace implements NumberArrayReplacement {
    private static Logger logger = LogManager.getLogger();

    @Override
    public int replaceOddIndexWithNumber(CustomArray customArray, int number) throws ArrayTaskException {
        if (customArray == null) {
            throw new ArrayTaskException("Given CustomArray is null");
        }

        int replaceAmount = 0;

        for (int i = 0; i < customArray.getLength(); i++) {
            if (i % 2 != 0) {
                customArray.setElement(i, number);
                replaceAmount++;
            }
        }

        logger.debug("Replaced array is " + customArray);
        logger.info("Amount of replacements in the array is " + replaceAmount);

        return replaceAmount;
    }

    public int replaceEvenIndexWithNumberStream(CustomArray customArray, int number) throws ArrayTaskException {
        if (customArray == null) {
            throw new ArrayTaskException("Given CustomArray is null");
        }

        AtomicInteger atomicReplaceAmount = new AtomicInteger();

        int[] array = customArray.getArray();

        Stream.of(array.length)
                .flatMapToInt(x -> IntStream.range(0, x))
                .filter(x -> (x % 2 == 0))
                .forEach(x -> {
                    try {
                        customArray.setElement(x, number);
                        atomicReplaceAmount.getAndIncrement();
                    } catch (ArrayTaskException e) {
                        logger.warn("Unreachable code");
                    }
                });

        int replaceAmount = atomicReplaceAmount.intValue();

        logger.debug("Replaced array is " + customArray);
        logger.info("Amount of replacements in the array is " + replaceAmount);

        return replaceAmount;
    }

}
