package com.fairycompany.arrays.entity;

import com.fairycompany.arrays.exception.ArrayTaskException;
import com.fairycompany.arrays.validator.ArrayTaskValidator;

import java.util.Arrays;

public class CustomArray {

    private int[] array;

    public CustomArray(int... array) throws ArrayTaskException {
        if (ArrayTaskValidator.isArrayNullOrEmpty(array)) {
            throw new ArrayTaskException("Given array is null or empty");
        }

        this.array = array;
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int... array) throws ArrayTaskException {
        if (ArrayTaskValidator.isArrayNullOrEmpty(array)) {
            throw new ArrayTaskException("Given array is null or empty");
        }

        this.array = array;
    }

    public int getElement(int index) {
        return array[index];
    }

    public void setElement(int index, int value) throws ArrayTaskException {
        if (ArrayTaskValidator.isIndexArrayOutOfBound(this.array, index)) {
            throw new ArrayTaskException("Given index is out of bound");
        }

        array[index] = value;
    }

    public int getLength() {
        return array.length;
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
        return Arrays.toString(array);
    }
}
