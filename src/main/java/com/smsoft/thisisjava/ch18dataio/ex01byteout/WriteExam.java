package com.smsoft.thisisjava.ch18dataio.ex01byteout;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExam {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("/Users/sumin/Desktop/dev/workspace/java-api-examples/test1.db");

            byte a = 10;
            byte b = 20;
            byte c = 30;

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush();
            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
