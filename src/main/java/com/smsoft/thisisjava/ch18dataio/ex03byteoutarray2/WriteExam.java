package com.smsoft.thisisjava.ch18dataio.ex03byteoutarray2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExam {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("/Users/sumin/Desktop/dev/workspace/java-api-examples/test3.db");

            byte[] array = {10, 20, 30, 40, 50};

            System.out.println(array);

            os.write(array, 1, 4);

            os.flush();
            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
