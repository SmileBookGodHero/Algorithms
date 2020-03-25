package com.lilei11981.test;


/**
 * Created by user on 2018/1/12.
 */
public class HelloWorld {
    //    public static void main(String[] args) {
//        System.out.println("HelloWorld");
//    }
    public static void main(String[] args) {
        String skyBranch = "甲,乙,丙,丁,戊,己,庚,辛,壬,癸";
        String[] sky = skyBranch.split(",");
        String earthBranch = "子,丑,寅,卯,辰,巳,午,未,申,酉,戌,亥";
        String[] earth = earthBranch.split(",");
        int i = 0;
        int j = 0;
        int k = 2044;
        String output = "";
        while (!"癸亥".equals(output)) {
            output = sky[i] + earth[j];
            System.out.println(k++ + " : " + output);
            i++;
            j++;
            if (i == sky.length) {
                i = 0;
            }
            if (j == earth.length) {
                j = 0;
            }
        }
    }
}
