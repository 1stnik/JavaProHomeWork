package com.hillel.converter.services;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

public interface FileService {

    List<String> getFilesPath(Path path);

    String getNewFilePath(File fileDir, String name);

    String readFromFile(String filePath);

    void writeToFile(File file, String newFileString, boolean append);

    long getFileSize(String pathToNewFile);

    void saveResult(File logFile, String oldName, String newName, long duration, String pathToNewFile);
}
