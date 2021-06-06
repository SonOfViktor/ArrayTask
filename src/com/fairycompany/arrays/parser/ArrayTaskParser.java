package com.fairycompany.arrays.parser;

import com.fairycompany.arrays.exception.ArrayTaskException;
import com.fairycompany.arrays.validator.ArrayTaskValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ArrayTaskParser {
    private static Logger logger = LogManager.getLogger();
    private static final String SPACE_DELIMITER_REGEX = "\\s+";

    public List<int[]> parseStringListToArray(List<String> stringList) throws ArrayTaskException {


        if (stringList == null || stringList.isEmpty()) {
            throw new ArrayTaskException("List is null or hasn't any strings");
        }


        ArrayList<int[]> intArraysList = new ArrayList<>();

        for (String arrayString : stringList) {
            if (ArrayTaskValidator.isStringIntArray(arrayString)) {
                String[] numbers = arrayString.split(SPACE_DELIMITER_REGEX);
                int[] array = new int[numbers.length];

                for (int i = 0; i < numbers.length; i++) {
                    array[i] = Integer.parseInt(numbers[i]);
                }

                intArraysList.add(array);

                logger.debug(arrayString + " has been added");
            } else {
                logger.info(arrayString + " can't be array");
            }
        }

        logger.info("Parsing is successful");

        return intArraysList;
    }
}
