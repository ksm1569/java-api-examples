package com.smsoft.thisisjava.ch18dataio.ex04bytein;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExam {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("/Users/sumin/Desktop/dev/workspace/java-api-examples/test1.db");

            while (true) {
                int data = is.read();

                if (data == -1) break;

                System.out.println(data);
            }

            is.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
