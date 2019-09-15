package com.zhongye;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(1234);
        int a = 9;
        Integer integer = 9;
        System.out.println(a + integer);
//
        int[] ints = new int[]{1, 2, 3, 3, 4};
        System.out.println(Arrays.toString(ints));
//
//        for(int i=0;i<ints.length;i++){
//            System.out.println(ints[i);}
//       while(true){
//       }
//       }
//           System.out.println(ints[j]





        int j = 0;
        do {
            System.out.println(ints[j]);
            j++;
            if (j == ints.length) {
                break;
            }
        } while (true);


//        Test Test=new Test();
//
//        Test.teet1();

        Test1 test1=new Test1();
        test1.test2();


    }


    public void teet1() {
        System.out.println(123);

    }
    public  static void tee2(){

    }

}
