package com.algorithms.fundamentals.basic.test1;

import com.algorithms.fundamentals.basic.test.StdOut;
import com.algorithms.fundamentals.basic.test.StdRandom;

/**
 * @author lilei
 * @date 2019-10-20 23:39
 * @description
 */

public class RandomSeq {
    public static void main(String[] args) {
        // 打印N个（lo,hi)之间的随机值
        int N = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);
        for (int i = 0; i < N; i++) {
            double x = StdRandom.uniform(lo, hi);
            StdOut.printf("%.2f\n", x);
        }
    }
}
