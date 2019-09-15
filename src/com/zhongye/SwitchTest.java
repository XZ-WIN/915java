package com.zhongye;

import java.util.Scanner;

public class SwitchTest {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String i=scanner.nextLine();




        switch(i){
            case "a":
                System.out.println(i);
                break;
            case "b":
                System.out.println(i);
                break;
            case "c":
                System.out.println(i);
                break;
                default:
                    System.out.println("都不");
        }


        System.out.println(1==1?1:2d);
    }
}
