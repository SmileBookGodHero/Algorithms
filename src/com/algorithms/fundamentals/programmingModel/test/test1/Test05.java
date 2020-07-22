package com.algorithms.fundamentals.programmingModel.test.test1;

/**
 * Created by user on 2018/1/12.
 */
public class Test05 {
    public static boolean isRange(double x, double y) {
        if ((x >= 0 && x < 1) && (y >= 0 && y < 1)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isRange(0, 0.1));
    }
}
