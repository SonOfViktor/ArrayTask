package com.fairycompany.arrays.entity;

import com.fairycompany.arrays.exception.CustomArrayException;
import com.fairycompany.arrays.validator.ArrayTaskValidator;

import java.util.Arrays;

public class CustomArray {

    private int[] array;

    public CustomArray(int... array) throws CustomArrayException {
        if (ArrayTaskValidator.isArrayNullOrEmpty(array)) {
            throw new CustomArrayException("Given array is null or empty");
        }

        this.array = array;
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int... array) throws CustomArrayException {
        if (ArrayTaskValidator.isArrayNullOrEmpty(array)) {
            throw new CustomArrayException("Given array is null or empty");
        }

        this.array = array;
    }

    public int getArrayElement(int index) {
        return array[index];
    }

    public void setArrayElement(int index, int value) throws CustomArrayException{
        if (ArrayTaskValidator.isIndexArrayOutOfBound(this.array, index)) {
            throw new CustomArrayException("Given index is out of bound");
        }
        array[index] = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomArray that = (CustomArray) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
