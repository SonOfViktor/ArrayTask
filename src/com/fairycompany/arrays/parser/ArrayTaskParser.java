package com.fairycompany.arrays.parser;

import com.fairycompany.arrays.exception.CustomArrayException;
import com.fairycompany.arrays.validator.ArrayTaskValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class ArrayTaskParser {
    private static Logger logger = LogManager.getLogger();

    public ArrayList<int[]> parseStringListIntoArray (ArrayList<String> stringList) throws CustomArrayException {

        if (ArrayTaskValidator.isListNullOrEmpty(stringList)) {
            throw new CustomArrayException("List is null or hasn't any strings");
        }

        ArrayList<int[]> arrayList = new ArrayList<>();

        for (String string : stringList) {
            if (ArrayTaskValidator.isStringIntArray(string)) {
                String[] numbers = string.split(" +");
                int[] array = new int[numbers.length];

                for (int i = 0; i < numbers.length; i++) {
                    array[i] = Integer.parseInt(numbers[i]);
                }

                arrayList.add(array);
                logger.debug(string + " has been added");
            } else {
                logger.info(string + " can't be array");
            }
        }

        return arrayList;
    }
}
