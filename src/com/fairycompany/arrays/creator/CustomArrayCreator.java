package com.fairycompany.arrays.creator;

import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.ArrayTaskException;
import com.fairycompany.arrays.validator.ArrayTaskValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class CustomArrayCreator {

    private static Logger logger = LogManager.getLogger();

    public ArrayList<CustomArray> createCustomArray(ArrayList<int[]> arrayList) throws ArrayTaskException {
        ArrayList<CustomArray> customArrayList = new ArrayList<>();

        if (ArrayTaskValidator.isListNullOrEmpty(arrayList)) {
            throw new ArrayTaskException("List is null or hasn't any arrays");
        }

        for (int[] array : arrayList) {
            customArrayList.add(new CustomArray(array));
        }

        logger.info("Creating CustomArray list is successful");

        return customArrayList;
    }
}
