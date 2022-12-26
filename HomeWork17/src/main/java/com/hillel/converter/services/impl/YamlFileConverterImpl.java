package com.hillel.converter.services.impl;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.hillel.converter.AppStart;
import com.hillel.converter.services.FileConverter;
import org.yaml.snakeyaml.Yaml;
import java.util.Map;
import org.yaml.snakeyaml.constructor.Constructor;

public class YamlFileConverterImpl implements FileConverter {

    /**
     * method converts .yaml <-> .json
     *
     * @param data - string data from yaml file
     * @return - string data for new json file
     */
    @Override
    public String fileConvert(String data) {


        try {
            Yaml yaml = new Yaml(new Constructor(Map[].class));
            Map[] map = yaml.load(data);
            AppStart.convertError = "";
            return new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(map);
        } catch (Exception e) {
            data = "";
            System.out.println("Can't convert Yaml file to Json!");
            AppStart.convertError = "ERROR_CONVERSION_";
        }
        return data;
    }
}