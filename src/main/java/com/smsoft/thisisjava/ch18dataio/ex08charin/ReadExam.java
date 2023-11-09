package com.smsoft.thisisjava.ch18dataio.ex08charin;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExam {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("/Users/sumin/Desktop/dev/workspace/java-api-examples/test.txt");

            while (true) {
                int data = reader.read();
                if(data == -1) break;
                System.out.print((char) data);
            }

            reader.close();
            System.out.println();

            reader = new FileReader("/Users/sumin/Desktop/dev/workspace/java-api-examples/test.txt");
            char[] data = new char[100];

            while (true) {
                int num = reader.read(data);
                if(num == -1) break;

                for (int i=0; i<num; i++) {
                    System.out.print(data[i]);
                }
            }
            reader.close();

        } catch (FileNotFoundException e) {
          e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
