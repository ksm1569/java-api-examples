package com.smsoft.thisisjava.ch15collection.ex07properties;

import java.util.Properties;

public class PropertiesExam {
    public static void main(String[] args) throws Exception{
        //hashtable 자식클래스
        Properties properties = new Properties();

        properties.load(PropertiesExam.class.getClassLoader().getResourceAsStream("database.properties"));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String userName = properties.getProperty("username");
        String password = properties.getProperty("password");
        String admin = properties.getProperty("admin");

        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + userName);
        System.out.println("password : " + password);
        System.out.println("admin : " + admin);
    }
}
