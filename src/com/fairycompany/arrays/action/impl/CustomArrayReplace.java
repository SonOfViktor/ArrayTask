package com.fairycompany.arrays.action.impl;

import com.fairycompany.arrays.action.NumberArrayReplacement;
import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.ArrayTaskException;
import com.fairycompany.arrays.validator.ArrayTaskValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CustomArrayReplace implements NumberArrayReplacement {
    private static Logger logger = LogManager.getLogger();

    @Override
    public void replaceOddIndexWithNumber(CustomArray customArray, int number) throws ArrayTaskException {
        if (ArrayTaskValidator.isCustomArrayNull(customArray)) {
            throw new ArrayTaskException("Given CustomArray is null");
        }

        for (int i = 0; i < customArray.getLength(); i++) {
            if (i % 2 != 0) {
                customArray.setElement(i, number);
            }
        }

        logger.info("Replaced array is " + customArray);
    }

    public void replaceEvenIndexWithNumberStream(CustomArray customArray, int number) throws ArrayTaskException {
        if (ArrayTaskValidator.isCustomArrayNull(customArray)) {
            throw new ArrayTaskException("Given CustomArray is null");
        }

        int[] array = customArray.getArray();

        Stream.of(array.length)
                .flatMapToInt(x -> IntStream.range(0, x))
                .filter(x -> (x % 2 == 0))
                .forEach(x -> array[x] = number);

        customArray.setArray(array);

//        Stream.of(array.length)
//                .flatMapToInt(x -> IntStream.range(0, x))
//                .filter(x -> (x % 2 == 0))
//                .forEach(x -> {
//                    try {
//                        logger.debug(x);
//                        customArray.setElement(x, number);
//                    } catch (ArrayTaskException e) {
//                        // this error won't never appear
//                    }
//                });

        logger.info("Replaced array is " + customArray);
    }

}
