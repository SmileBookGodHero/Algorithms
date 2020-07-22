package com.algorithms.fundamentals.programmingModel;

import edu.princeton.cs.algs4.StdDraw;

/**
 * Created by lilei on 2017/11/10 下午3:05.
 */
public class StdDrawFunctionValue {
    public static void main(String[] args) {
        int N = 100;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N * N);
        StdDraw.setPenRadius(0.01);
        for (int i = 1; i <= N; i++) {
            StdDraw.point(i, i);
//            StdDraw.point(i, i * i);
            StdDraw.point(i, i * Math.log(i));
        }

    }
}
