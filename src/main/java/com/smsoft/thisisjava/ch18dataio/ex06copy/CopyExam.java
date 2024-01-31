package com.smsoft.thisisjava.ch18dataio.ex06copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExam {
    public static void main(String[] args) throws Exception {
        // 아래예제 자바9부터 is.transferTo(os) 한방임

        String originalFileName = "/Users/sumin/Desktop/dev/workspace/java-api-examples/test.jpg";
        String targetFileName = "/Users/sumin/Desktop/dev/workspace/java-api-examples/test2.jpg";

        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(targetFileName);

        byte[] data = new byte[1024];

        while (true) {
            int num = is.read(data);
            if (num == -1) break;

            os.write(data, 0, num);
        }

        os.flush();
        os.close();
        is.close();

        System.out.println("복사 완료");
    }
}
