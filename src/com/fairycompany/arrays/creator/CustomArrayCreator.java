package com.fairycompany.arrays.creator;

import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.ArrayTaskException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayCreator {

    private static Logger logger = LogManager.getLogger();

    public List<CustomArray> createCustomArray(List<int[]> intArraysList) throws ArrayTaskException {
        ArrayList<CustomArray> customArrayList = new ArrayList<>();

        if (intArraysList == null || intArraysList.isEmpty()) {
            throw new ArrayTaskException("Given list is null or hasn't any arrays");
        }

        for (int[] array : intArraysList) {
            customArrayList.add(new CustomArray(array));
        }

        logger.info("Creating CustomArray list is successful");

        return customArrayList;
    }
}
