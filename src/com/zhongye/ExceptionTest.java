package com.zhongye;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExceptionTest {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//
////        String s=scanner.nextLine();
//        int a=scanner.nextInt();
//
//        System.out.println(a);
////        System.out.println(s );


       try{ String s=null;
        System.out.println(s.length());
           System.out.println(1/0);

           int[] is=new int[]{1,2,5,5};
           System.out.println(is[5]);

           Set set=new HashSet();
           set.add("1344");
           set.add(232);
           Iterator it=set.iterator();
           while(it.hasNext()){
               Object o=it.next();
               String s1=(String) o;
               System.out.println(s1);}


           int i=Integer.parseInt("12ew");
           System.out.println(i+1);

    }catch (Exception e){
           e.printStackTrace();
       }finally {
           System.out.println("无论如何都要执行");
       }

        System.out.println(234);




    }
}
