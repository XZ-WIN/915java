package com.zhongye;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SetImport {
    public static void main(String[] args) {
        int[] is=new int[10];



        List<Integer> list=new ArrayList();

        list.add(1);

        System.out.println(list.size());
        for(int i=0;i<list.size();i++)
        {
            Integer it=list.get(i);        }


        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
