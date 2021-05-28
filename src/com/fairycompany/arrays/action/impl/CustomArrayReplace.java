package com.fairycompany.arrays.action.impl;

import com.fairycompany.arrays.action.NumberArrayReplacement;
import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.ArrayTaskException;
import com.fairycompany.arrays.validator.ArrayTaskValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayReplace implements NumberArrayReplacement {
    private static Logger logger = LogManager.getLogger();

    @Override
    public void replaceOddElementsWithNumber(CustomArray customArray, int number) throws ArrayTaskException {
        if (ArrayTaskValidator.isCustomArrayNull(customArray)) {
            throw new ArrayTaskException("Given CustomArray is null");
        }

        for (int i = 0; i < customArray.getLength(); i++) {
            if (i % 2 > 0) {
                customArray.setElement(i, number);
            }
        }

        logger.info("Replaced array is " + customArray.toString());

    }

}
