package org.example.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader     {
    public PropertyReader() {
    }

    public static String readyKey(String key){
        FileInputStream fileInputStream = null;
        Properties p =null ;
        try {
            fileInputStream = new FileInputStream
                    (System.getProperty("C:\\Pramod Dutta\\ATB5XSeleniumAutomationFramework\\src\\main\\java\\resources\\data.properties"));
            p = new Properties();
            p.load(fileInputStream);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return p.getProperty(key);
    }
}
