package com.zhongye;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        //

        List<String> list=new ArrayList();
        list.add("123");
        list.add("456");
        list.add("789");
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.isEmpty());
        list.remove(0);
        list.clear();
        System.out.println(list.size());


    }

}
