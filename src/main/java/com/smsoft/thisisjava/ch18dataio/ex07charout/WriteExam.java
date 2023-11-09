package com.smsoft.thisisjava.ch18dataio.ex07charout;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExam {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("/Users/sumin/Desktop/dev/workspace/java-api-examples/test.txt");

            char a = 'A';
            writer.write(a);

            char b = 'B';
            writer.write(b);

            char[] arr = {'C', 'D', 'E'};
            writer.write(arr);

            writer.write("FGH");

            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
