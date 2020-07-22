package com.algorithms.fundamentals.programmingModel.basic;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by lilei on 2017/9/22 上午11:02.
 */
public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> stack;
        stack = new Stack<>();
        while (!StdIn.isEmpty()) {
            stack.push(StdIn.readInt());
        }
        for (int i : stack) {
            StdOut.println(i);
        }
    }
}
