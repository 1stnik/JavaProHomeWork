package com.hillel.converter.services.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hillel.converter.services.FileConverter;
import com.hillel.converter.services.exceptions.JsonConversionError;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;

public class JsonFileConverterImpl implements FileConverter {

    /**
     * method converts .json <-> .yaml
     *
     * @param data - string data from json file
     * @return - string data for new yaml file
     */
    @Override
    public String fileConvert(String data) throws JsonConversionError {

        try {
            ObjectMapper mapper = new ObjectMapper();
            Map[] map = mapper.readValue(data, Map[].class);
            Yaml yaml = new Yaml();
            return yaml.dump(map);

        } catch (JsonProcessingException e) {
            System.out.println("Can't convert Json file to Yaml!");
            throw new JsonConversionError();
        }
    }
}
