package com.fairycompany.arrays.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ArrayTaskReader {

    private static Logger logger = LogManager.getLogger();

    public List<String> readFile(String path) {
        List<String> stringList = new ArrayList<>();

        try {
            File dataFile = new File(path);

            if (dataFile.length() == 0) {
                logger.fatal("File " + dataFile.getName() + " does not exist or is empty");
                throw new RuntimeException();
            }

            stringList = Files.readAllLines(dataFile.toPath());

            logger.info("Read file is successful");

        } catch (IOException e) {
            logger.error("Input error during reading file " + path);
        }

        return stringList;
    }
}