package com.zhongye;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Field;

public class shoujianexception {

    public static void main(String[] args) throws FileNotFoundException {
//        File file=new File("Z:1234");
//        System.out.println(file.exists());
//        InputStream is=new FileInputStream(file);

        try {
            f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  static void f() throws Exception {
        throw new Exception();
    }

}
