package com.fairycompany.arrays.reader;

import com.fairycompany.arrays.validator.ArrayTaskValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.file.Files;
import java.util.List;

public class ArrayTaskReader {

    private static Logger logger = LogManager.getLogger();

    public List<String> readFile(String path) {
        List<String> stringList;

        try {
            File file = new File(path);

            if (ArrayTaskValidator.isFileEmpty(path)) {
                logger.fatal("File does not exist or is empty");
                throw new RuntimeException();
            }

            stringList = Files.readAllLines(file.toPath());

            logger.info("Read file is successful");

        } catch (IOException e) {
            logger.fatal("Input error during reading file");
            throw new RuntimeException();
        }

        return stringList;
    }
}