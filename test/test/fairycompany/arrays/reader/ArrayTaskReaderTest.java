package test.fairycompany.arrays.reader;

import com.fairycompany.arrays.reader.ArrayTaskReader;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class ArrayTaskReaderTest {

    String pathName;
    String wrongPathName;
    String emptyFilePathName;
    List<String> expected;
    ArrayTaskReader arrayTaskReader;

    @BeforeClass
    public void setUp() {
        arrayTaskReader = new ArrayTaskReader();
        pathName = "resources\\data\\data.txt";
        wrongPathName = "resources\\data\\nodata.txt";
        emptyFilePathName = "resources\\data\\emptydata.txt";

    }

    @Test
    public void testReadFile() {
        List<String> actual = arrayTaskReader.readFile(pathName);
        expected = new ArrayList<>();
        expected.add("2 -70 51 -85 90 -72 18 71 2 0");
        expected.add("-3 d8 22 11");
        expected.add("");
        expected.add("8 10 - 3 15");
        expected.add("1 -2 3 10 -4");
        assertEquals(actual, expected);
    }

    @Test(description = "RuntimeException is called if file doesn't exist",
            expectedExceptions = RuntimeException.class)
    public void testReadNullFileException() {
        arrayTaskReader.readFile(wrongPathName);
    }

    @Test(description = "RuntimeException is called if file is empty",
            expectedExceptions = RuntimeException.class)
    public void testReadEmptyFileException() {
        arrayTaskReader.readFile(emptyFilePathName);
    }
}