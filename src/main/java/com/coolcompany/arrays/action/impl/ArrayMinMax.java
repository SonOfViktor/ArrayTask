package main.java.com.coolcompany.arrays.action.impl;

import main.java.com.coolcompany.arrays.action.Search;

public class ArrayMinMax implements Search {

    @Override
    public int searchMinElement(int[] array) {
        int minElement = array[0];

        for (int element : array) {
            minElement = (minElement < element) ? minElement : element;
        }

        return minElement;
    }

    @Override
    public int searchMaxElement(int[] array) {
        int maxElement = array[0];

        for (int element : array) {
            maxElement = Math.max(maxElement, element);
        }

        return maxElement;
    }

}
