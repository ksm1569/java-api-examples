package com.smsoft.thisisjava.ch18dataio.ex02writearray;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExam {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("/Users/sumin/Desktop/dev/workspace/java-api-examples/test2.db");

            byte[] array = {10, 20, 30};

            System.out.println(array);

            os.write(array);

            os.flush();
            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
