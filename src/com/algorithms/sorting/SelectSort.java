package com.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author lilei
 * @date 2020-07-22 17:11
 * @apiNote 选择排序
 * 时间复杂度：O(n^2)
 * 稳定性：稳定
 * 辅助空间：O(1)
 * 基本思想:
 * 在长度为n的无序数组中，第一次遍历n-1个数，找到最小的数值与第一个元素交换；
 * 第二次遍历n-2个数，找到最小的数值与第二个元素交换；
 * 直到n-1次
 */

public class SelectSort {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        int[] a = new int[list.size()];
        for (int i = 0; i < a.length; i++) {
            a[i] = list.get(i);
        }
        System.out.println(Arrays.toString(a));
        selectSort(a);
    }

    private static void selectSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                System.out.println(Arrays.toString(a));
            }
        }
    }
}
