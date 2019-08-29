package com.kodilla.exception.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public void readFile() throws IOException {

        ClassLoader classLoader = getClass().getClassLoader();
        BufferedReader in = new BufferedReader(new InputStreamReader(classLoader.getResourceAsStream("file/names.txt"),
                "UTF8"));
        String str = in.readLine();
        System.out.println(str);

    }
}
