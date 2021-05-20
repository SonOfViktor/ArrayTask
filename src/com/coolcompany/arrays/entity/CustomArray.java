package com.coolcompany.arrays.entity;

import java.util.Arrays;

public class CustomArray {

    private int[] array;

    public CustomArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
