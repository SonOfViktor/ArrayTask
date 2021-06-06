package test.fairycompany.arrays.action.impl;

import com.fairycompany.arrays.action.impl.CustomArrayReplace;
import com.fairycompany.arrays.entity.CustomArray;
import com.fairycompany.arrays.exception.ArrayTaskException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomArrayReplaceTest {

    CustomArrayReplace customArrayReplace;
    CustomArray customArray;

    @BeforeMethod
    public void setUp() throws ArrayTaskException {
        customArrayReplace = new CustomArrayReplace();
        customArray = new CustomArray(9, 8, 20, -453, 800, 0, 21);
    }

    @Test(description = "Check replacement elements with odd index with given number")
    public void testReplaceOddIndexWithNumber() throws ArrayTaskException {
        CustomArray actual = customArray;
        customArrayReplace.replaceOddIndexWithNumber(actual, 10);
        CustomArray expectedCustomArray = new CustomArray(9, 10, 20, 10, 800, 10, 21);
        assertEquals(actual, expectedCustomArray);
    }

    @Test(description = "Check replacement elements with even index with given number")
    public void testReplaceEvenIndexWithNumberStream() throws ArrayTaskException {
        CustomArray actual = customArray;
        customArrayReplace.replaceEvenIndexWithNumberStream(actual, 10);
        CustomArray expectedCustomArray = new CustomArray(10, 8, 10, -453, 10, 0, 10);
        assertEquals(actual, expectedCustomArray);
    }

    @Test(description = "Check amount of replacement elements with odd index with given number")
    public void testAmountOddIndex() throws ArrayTaskException {
        int actual = customArrayReplace.replaceOddIndexWithNumber(customArray, 10);
        int expected = 3;
        assertEquals(actual, expected);
    }

    @Test(description = "Check amount of replacement elements with even index with given number")
    public void testAmountEvenIndex() throws ArrayTaskException {
        int actual = customArrayReplace.replaceEvenIndexWithNumberStream(customArray, 10);
        int expected = 4;
        assertEquals(actual, expected);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testReplaceOddIndexWithNumberException() throws ArrayTaskException {
        customArrayReplace.replaceOddIndexWithNumber(null, 10);
    }

    @Test(description = "ArrayTaskException is called if CustomArray null",
            expectedExceptions = ArrayTaskException.class)
    public void testReplaceEvenIndexWithNumberStreamException() throws ArrayTaskException {
        customArrayReplace.replaceEvenIndexWithNumberStream(null, 10);
    }
}