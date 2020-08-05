package com.algorithms.fundamentals.programmingModel.test;

import edu.princeton.cs.algs4.StdDraw;

import java.util.Arrays;
import java.util.Random;

/**
 * @author lilei
 * @date 2020-08-05 17:59
 * @apiNote
 */

public class Gaussian {
    public static void main(String[] args) {
        int N = 1000;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(-4, 4);
        StdDraw.setPenRadius(0.01);
        double[] nums = new double[N];
        for (int i = 0; i < N; i++) {
            double num = new Random().nextGaussian();
            nums[i] = num;
            StdDraw.point(i, num);
        }
        Arrays.sort(nums);
        System.out.println(nums[0]);
        System.out.println(nums[N - 1]);
        System.out.println(Arrays.toString(nums));
    }
}
