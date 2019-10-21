package com.lilei11981.basic.test1;


import com.lilei11981.basic.test.StdIn;
import com.lilei11981.basic.test.StdOut;


/**
 * @author lilei
 * @time 2019-10-20 23:57
 * @description
 */

public class Average {
    public static void main(String[] args) {
        // 取StdIn中所有数的平均值
        double sum = 0.0;
        int cnt = 0;
        while (!StdIn.isEmpty()) {
            // 读取一个数并计算累计之和
            sum += StdIn.readDouble();
            cnt++;
        }
        double avg = sum / cnt;
        StdOut.printf("Average is %.5f\n", avg);
    }
}
