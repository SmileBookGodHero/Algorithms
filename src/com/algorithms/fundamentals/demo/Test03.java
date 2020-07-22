package com.algorithms.fundamentals.demo;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/**
 * Created by lilei on 2017/9/18 下午2:17.
 */
public class Test03 {
    public static void main(String[] args) {
        int N = 50;
        double[] a = new double[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.random();
        }
        Arrays.sort(a);
        for (int i = 0; i < N; i++) {
            double x = 1.0 * i / N;
            double y = a[i] / 2.0;
            double width = 0.4 / N;
            double high = a[i] / 2.0;
            StdDraw.filledRectangle(x, y, width, high);
        }
    }
}
