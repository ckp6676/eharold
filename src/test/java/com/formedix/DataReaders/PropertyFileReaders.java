package com.formedix.DataReaders;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Properties;

public class PropertyFileReaders {
    public static LinkedHashMap<Object, Object> test_data = new LinkedHashMap<>();

    static {
        if (test_data.size() == 0) {
            readProperties();
        }

    }

    private static void readProperties() {
        File f = new File("TestData");
        if (f.isDirectory()) {
            for (File eachPropFile : f.listFiles()) {
                try {
                    FileInputStream fis = new FileInputStream(eachPropFile);
                    Properties p = new Properties();
                    p.load(fis);
                    test_data.putAll(p);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }

    public static String getPropertyValue(String key) {
        return test_data.get(key).toString();
    }
}