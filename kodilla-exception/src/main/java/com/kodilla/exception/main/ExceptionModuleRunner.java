package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ExceptionModuleRunner {

    public static void main(String args[]) {


        FileReader fileReader = new FileReader();
        //File file = new File(classLoader.getResource("file/names.txt").getFile());
        //try (Stream<String> fileLines = Files.lines(Path.get(file.getPath()))) {
         //   ileLines.forEach(System.out::println);
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}

    }
}
