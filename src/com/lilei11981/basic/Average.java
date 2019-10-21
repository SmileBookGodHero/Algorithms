package com.lilei11981.basic;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by lilei on 2017/9/18 下午1:45.
 * 输入输出
 */
public class Average {
    public static void main(String[] args) {
        double sum = 0.0;
        int count = 0;
        while (!StdIn.isEmpty()) {
            sum += StdIn.readDouble();
            count++;
        }
        double average = sum / count;
        StdOut.printf("Average is %.5f\n", average);
    }
}
