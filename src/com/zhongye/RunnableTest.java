package com.zhongye;

import java.util.Date;

public class RunnableTest {
    public static void main(String[] args) {

        Runnable runnable=new MyRunnable();
        Thread thread=new Thread(runnable);
        thread.start();

//        new Thread(new MyRunnable()).start();
        }
}



class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<1000;i++)
        {
            System.out.println(new Date());
        }
    }
}
