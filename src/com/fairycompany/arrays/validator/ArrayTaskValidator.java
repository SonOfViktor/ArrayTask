package com.fairycompany.arrays.validator;

import com.fairycompany.arrays.entity.CustomArray;

import java.io.File;
import java.util.List;

public class ArrayTaskValidator {

    private ArrayTaskValidator() {
    }

    public static boolean isArrayNullOrEmpty(int[] array) {
        return (array == null || array.length <= 0);
    }

    public static boolean isIndexArrayOutOfBound(int[] array, int i) {
        return (i < 0) || (i >= array.length);
    }

    public static boolean isStringIntArray(String string) {
        String intNumberArrayRegex = "-?\\d+((\\s+-?\\d+)?)+$";
        return (string.matches(intNumberArrayRegex));
    }

    public static boolean isListNullOrEmpty(List<?> list) {
        return ((list == null) || list.isEmpty());
    }

    public static boolean isCustomArrayNull(CustomArray customArray) {
        return customArray == null;
    }

    public static boolean isFileEmpty(String path) {
        long size = new File(path).length();
        return size == 0;
    }

}
