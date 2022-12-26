package com.hillel.converter;

/**
 * @author Serhii Nikonenko
 * @version 2.0.1
 */

import com.hillel.converter.services.FileConverter;
import com.hillel.converter.services.FileService;
import com.hillel.converter.services.impl.FileServiceImpl;
import com.hillel.converter.services.impl.JsonFileConverterImpl;
import com.hillel.converter.services.impl.YamlFileConverterImpl;
import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class AppStart {

    private final static String JSON = "json";
    private final static String YAML = "yaml";

    public static void main(String[] args) {

        Path path;
        if (args.length != 0) {
            path = Paths.get(args[0]);
            System.out.println("Path -> " + path);
        } else {
            path = FileSystems.getDefault().getPath("").toAbsolutePath();
            System.out.println("Default path -> " + path);
        }

        FileService fs = new FileServiceImpl();
        List<String> sortedFiles = fs.getFilesPath(path);

        File sortedFileDir = new File(path.toString().concat(File.separator).concat("converted"));
        sortedFileDir.mkdir();



        for (String name : sortedFiles) {
            String pathToFile = path.toString().concat(File.separator).concat(name);

            long start = System.currentTimeMillis();
            long stop;
            long duration;
            File logFile = new File(sortedFileDir.getPath().concat(File.separator).concat("result.log"));

            if (name.endsWith(JSON)) {
                FileConverter jfc = new JsonFileConverterImpl();
                String str = jfc.fileConvert(fs.readFromFile(pathToFile));

                String newName = name.replaceAll("\\.json", "\\.yaml");
                String pathToNewFile = sortedFileDir.getPath().concat(File.separator).concat(newName);
                File newYamlFile = new File(pathToNewFile);
                fs.writeToFile(newYamlFile, str, false);
                stop = System.currentTimeMillis();
                duration = stop - start;
                fs.saveResult(logFile, name, newName, duration, pathToNewFile);

            } else if (name.endsWith(YAML)) {
                FileConverter yfc = new YamlFileConverterImpl();
                String str = yfc.fileConvert(fs.readFromFile(pathToFile));

                String newName = name.replaceAll("\\.yaml", "\\.json");
                String pathToNewFile = sortedFileDir.getPath().concat(File.separator).concat(newName);
                File newJsonFile = new File(pathToNewFile);
                fs.writeToFile(newJsonFile, str, false);
                stop = System.currentTimeMillis();
                duration = stop - start;
                fs.saveResult(logFile, name, newName, duration, pathToNewFile);
            }
        }
    }
}