package com.fairycompany.arrays.action;

import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.ArrayTaskException;

public interface NumberArraySearch {

    int searchMinElement(CustomArray customArray) throws ArrayTaskException;

    int searchMaxElement(CustomArray customArray) throws ArrayTaskException;

    int searchMinElementStream(CustomArray customArray) throws ArrayTaskException;

    int searchMaxElementStream(CustomArray customArray) throws ArrayTaskException;

}
