package com.zhongye;

import java.io.*;

public class BufferTest {
    public static void main(String[] args) throws IOException {
        String path = "E:\\915java\\src\\com\\zhongye\\BufferTest.java";
        File file = new File(path);
        Reader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = "";
        while (true) {
            line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);

        }
        bufferedReader.close();
        reader.close();


//        String path="E://2.txt";
//        File file=new File(path);
//        Writer writer=new FileWriter(file);
//        BufferedWriter bufferedWriter=new BufferedWriter(writer);
//        bufferedWriter.write("I am ljljk ");
//        bufferedWriter.newLine();
//        bufferedWriter.write("sdkljsjd");
//        bufferedWriter.flush();
//        bufferedWriter.close();
//        writer.close();

    }
}
