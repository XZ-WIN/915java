package com.zhongye;

import com.sun.javafx.collections.ListListenerHelper;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {


    public static void main(String[] args) {
        Stack<String> stack =new Stack<>();
        stack.push("1334");
        stack.push("343");
        stack.push("agc");
        stack.push("34");

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());


        Queue<String> queue=new LinkedList<>();
        queue.add("133");
        queue.add("13213");
        queue.add("125");

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.size());


    }



}
