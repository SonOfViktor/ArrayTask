package com.fairycompany.arrays.validator;

import com.fairycompany.arrays.entity.CustomArray;

import java.io.File;
import java.util.List;

public class ArrayTaskValidator {

    private static final String INT_ARRAY_CHECKER_REGEX = "-?\\d+((\\s+-?\\d+)?)+$";

    private ArrayTaskValidator() {
    }

    public static boolean isIndexArrayOutOfBound(int[] array, int index) {
        return index < 0 || index >= array.length;
    }

    public static boolean isStringIntArray(String stringData) {
        return stringData.matches(INT_ARRAY_CHECKER_REGEX);
    }

}

