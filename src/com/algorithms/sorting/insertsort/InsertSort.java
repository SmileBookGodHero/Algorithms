package com.algorithms.sorting.insertsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author lilei
 * @date 2020-07-22 18:07
 * @apiNote 插入排序
 * 时间复杂度：O(n^2)
 * 稳定性：稳定
 * 辅助空间：O(1)
 * 基本思想：
 * 在要排序的一组数中，假定前n-1个数已经排好序，现在将第n个数插到前面的有序数列中，使得这n个数也是排好顺序的。
 * 如此反复循环，直到全部排好顺序。
 */

public class InsertSort {
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
        insertSort(a);
    }

    private static void insertSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                    System.out.println(Arrays.toString(a));
                } else {
                    break;
                }
            }
        }
    }
}
