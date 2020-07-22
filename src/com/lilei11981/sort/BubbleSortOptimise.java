package com.lilei11981.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author lilei
 * @date 2020-07-22 17:11
 * @apiNote 冒泡排序优化版，如果提前排序完成，不再进行后续比较
 */

public class BubbleSortOptimise {

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
        bubbleSort(a);
    }

    private static void bubbleSort(int[] a) {
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            boolean swap = false;
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                    swap = true;
                    System.out.println(Arrays.toString(a));
                }
            }
            if (!swap) {
                return;
            }
        }
    }
}
