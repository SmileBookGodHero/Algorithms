package com.lilei11981.test.test1;

import java.math.BigInteger;

/**
 * @author lilei
 * @date 2020-06-21 22:27
 * @apiNote
 */

public class Test02 {
    public static void main(String[] args) {
        BigInteger integer = new BigInteger("1");
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            integer = integer.multiply(BigInteger.valueOf(Integer.valueOf(i)));
        }
        System.out.println(integer);
    }
}
