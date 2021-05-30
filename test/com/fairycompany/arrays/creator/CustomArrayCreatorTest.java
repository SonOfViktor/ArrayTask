package com.fairycompany.arrays.creator;

import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.ArrayTaskException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class CustomArrayCreatorTest {

    CustomArrayCreator customArrayCreator;
    ArrayList<int[]> arrayList;
    ArrayList<CustomArray> customArrayList;


    @BeforeClass
    public void setUp() throws ArrayTaskException {
        customArrayCreator = new CustomArrayCreator();
        arrayList = new ArrayList<>();
        arrayList.add(new int[]{1, 3, 4, 5});
        arrayList.add(new int[]{1});
        customArrayList = customArrayCreator.createCustomArray(arrayList);
    }

    @Test(description = "Check CustomArray is created with int[] with numbers")
    public void testCreateCustomArray() throws ArrayTaskException {
        CustomArray actual = customArrayList.get(0);
        CustomArray expected = new CustomArray(1, 3, 4, 5);
        assertEquals(actual, expected);
    }

    @Test(description = "Check CustomArray is created with int[] with one number")
    public void testCreateCustomArrayOneNumber() throws ArrayTaskException {
        CustomArray actual = customArrayList.get(1);
        CustomArray expected = new CustomArray(1);
        assertEquals(actual, expected);
    }

    @Test(description = "ArrayTaskException is called if int[] is empty",
            expectedExceptions = ArrayTaskException.class)
    public void testCreateCustomArrayEmptyArrayException() throws ArrayTaskException {
        arrayList.add(new int[]{});
        customArrayCreator.createCustomArray(arrayList);
    }

    @Test(description = "ArrayTaskException is called if given list is null",
            expectedExceptions = ArrayTaskException.class)
    public void testCreateNullCustomArrayException() throws ArrayTaskException {
        customArrayCreator.createCustomArray(null);
    }

    @Test(description = "ArrayTaskException is called if given list is empty",
            expectedExceptions = ArrayTaskException.class)
    public void testCreateEmptyCustomArrayException() throws ArrayTaskException {
        ArrayList<int[]> emptyList = new ArrayList<>();
        customArrayCreator.createCustomArray(emptyList);
    }
}