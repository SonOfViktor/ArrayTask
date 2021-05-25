package com.fairycompany.arrays.creator;

import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.CustomArrayException;
import com.fairycompany.arrays.validator.ArrayTaskValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class CustomArrayCreator {

    private static Logger logger = LogManager.getLogger();

    public ArrayList<CustomArray> createCustomArray(ArrayList<int[]> arrayList) throws CustomArrayException {
        ArrayList<CustomArray> customArrayList = new ArrayList<>();

        if (ArrayTaskValidator.isListNullOrEmpty(arrayList)) {
            throw new CustomArrayException("List is null or hasn't any arrays");
        }

        for (int[] array : arrayList) {
            customArrayList.add(new CustomArray(array));
        }

        logger.info("Create list of CustomArrays is successful");

        return customArrayList;
    }
}
