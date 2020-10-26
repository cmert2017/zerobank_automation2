package com.zerobank.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static final Properties properties = new Properties();


    static {
        try {
            FileInputStream in = new FileInputStream("configuration.properties");
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Filed to load the file");
        }

    }




    public static String getProperty(String key){

        return  properties.getProperty(key);
    }

}
