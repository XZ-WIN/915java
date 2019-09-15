package com.zhongye;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<String> set =new HashSet();
        set.add("123");
        set.add("123");
        set.add("345");
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.remove("123"));


        Iterator<String> it =set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Set<String> set1=new HashSet<>( );
        set1.add("abc");
        set1.add("1dd");
        set1.add("232");
        set1.add("b23");
        Iterator<String> iterator = set1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }

    }
}
