package com.zhongye;

public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {

        new MyTherad().start();

//        for(int i=0;i<10000;i++){
//            System.out.println(i);
//
//        }
        Thread.sleep(1000);

        System.out.println(12345);
        System.out.println(323232);


    }
}

class MyTherad extends Thread{
    public void run(){
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
        }

    }

}

