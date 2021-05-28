package com.fairycompany.arrays.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
import java.util.ArrayList;

public class ArrayTaskReader {

    private static Logger logger = LogManager.getLogger();

    public ArrayList<String> readFile(String path) {
        ArrayList<String> stringList = new ArrayList<>();
        String fileLine;

        try (BufferedReader reader = new BufferedReader (new FileReader(path))) {

            while ((fileLine = reader.readLine()) != null) {
                    stringList.add(fileLine);
            }

            logger.info("Read file is successful");

        } catch (FileNotFoundException e) {
            logger.fatal("File is not found");
            e.printStackTrace();
        } catch (IOException e) {
            logger.error("Input error");
            e.printStackTrace();
        }

        return stringList;
    }
}
