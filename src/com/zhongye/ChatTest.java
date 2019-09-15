package com.zhongye;

import java.io.*;

public class ChatTest {

    public static void main(String[] args) throws IOException {
        File file=new File("E:/1.txt");
//        Reader reader=new FileReader(file);
//
//        char[] chars=new char[2];
//        int length=0;
//        while(true){
//            length=reader.read(chars,0,chars.length);
//            if(length==-1){
//                break;
//
//            }
//            System.out.print(new String(chars,0,length));
//
//        }
//        reader.close();

        Writer writer=new FileWriter(file,true);
        writer.write("I am cxxc");
        writer.flush();
        writer.close();
    }
}

