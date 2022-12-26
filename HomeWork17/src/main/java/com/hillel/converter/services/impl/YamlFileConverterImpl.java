package com.hillel.converter.services.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hillel.converter.services.FileConverter;
import com.hillel.converter.services.exceptions.YamlConversionError;
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
    public String fileConvert(String data) throws YamlConversionError {

        Yaml yaml = new Yaml(new Constructor(Map[].class));
        Map[] map = yaml.load(data);
        try {
            return new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(map);
        } catch (JsonProcessingException e) {
            System.out.println("Can't convert Yaml file to Json!");
            throw new YamlConversionError();
        }
    }
}