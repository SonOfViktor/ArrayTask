package com.fairycompany.arrays.validator;

import com.fairycompany.arrays.entity.CustomArray;

import java.util.ArrayList;

public class ArrayTaskValidator {

    public static boolean isArrayNullOrEmpty(int[] array) {
        return (array == null || array.length <= 0);
    }

    public static boolean isIndexArrayOutOfBound(int[] array, int i) {
        return (i < 0) || (i >= array.length);
    }

    public static boolean isStringIntArray(String string) {
        String regex = "^-?\\d+(\\s+-?\\d+)+$";
        return (string.matches(regex));
    }

    public static boolean isListNullOrEmpty(ArrayList<?> list) {
        return ((list == null) || list.isEmpty());
    }

    public static boolean isCustomArrayNull(CustomArray customArray) {
        return customArray == null;
    }

}
