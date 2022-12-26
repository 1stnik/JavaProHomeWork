package com.hillel.converter.services.impl;

import com.hillel.converter.services.FileService;
import com.hillel.converter.services.exceptions.FileSizeException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class FileServiceImpl implements FileService {


    /**
     * method gets a path and creates list of all file names in directory (path)
     *
     * @param path - directory, where might be files for conversion
     * @return - list of all file names in directory (path)
     */
    @Override
    public List<String> getFilesPath(Path path) {

        File file = new File(path.toUri());
        List<String> filesPath;
        if (file.isDirectory()) {
            filesPath = Arrays.asList(Objects.requireNonNull(path.toFile().list()));
        } else {
            System.out.println("It's not a directory!!!");
            filesPath = new ArrayList<>();
        }
        System.out.println("All files in directory -> " + filesPath);
        return getValidFilesPath(filesPath);
    }


    /**
     * method gets the list of all file names in directory (path) and creates list of all file names,
     * that will be converted
     *
     * @param filesPath - list of all file names in directory (path)
     * @return - sorted list of all file names, that will be converted
     */
    private List<String> getValidFilesPath(List<String> filesPath) {
        List<String> extensions = List.of("json", "yaml");
        List<String> sortedList = new ArrayList<>();
        for (String s : filesPath) {
            for (String ex : extensions) {
                if (s.toLowerCase().endsWith(ex.toLowerCase())) {
                    sortedList.add(s);
                }
            }
        }
        System.out.println("Sorted list: " + sortedList);
        return sortedList;
    }


    /**
     * method gets path to file as string and reads data from file
     *
     * @param filePath - path to file
     * @return - string data from file
     */
    @Override
    public String readFromFile(String filePath) {

        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            System.out.println("Can't read data from file...");
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }


    /**
     * method write data to file
     *
     * @param file          - file to be written
     * @param newFileString - data to be written
     */
    @Override
    public void writeToFile(File file, String newFileString, boolean append) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            OutputStream outputStream =
                    new FileOutputStream(file, append);
            outputStream.write(newFileString.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * method get file size
     *
     * @param pathToNewFile - path to new file
     * @return file size as long value
     */
    public long getFileSize(String pathToNewFile) throws FileSizeException {
        try {
            return Files.size(Paths.get(pathToNewFile));
        } catch (IOException e) {
            throw new FileSizeException();
        }
    }


    /**
     * method saves conversion result to log file
     *
     * @param logFile - log file
     * @param oldName - name of file before conversion
     * @param newName - name of file after conversion
     * @param duration - time of conversion
     * @param pathToNewFile - path to file after conversion
     */
    @Override
    public void saveResult(File logFile, String oldName, String newName, long duration, String pathToNewFile) {
        String content = "Old file name: " + oldName + "\nNew file name: " + newName +
                "\nProgram execution time: " + duration + " millis" + "\nFile size: " +
                getFileSize(pathToNewFile) + " bites\n\n";
        writeToFile(logFile, content, true);

    }
}
