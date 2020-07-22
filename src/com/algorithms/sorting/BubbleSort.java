package com.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author lilei
 * @date 2020-07-22 16:17
 * @apiNote 冒泡排序
 * 时间复杂度：O(n2)
 * 基本思想：两个数比较大小，较大的数下沉，较小的数冒起来
 * 过程：
 * 比较相邻的两个数据，如果第二个数小，就交换位置。
 * 从后向前两两比较，一直到比较最前两个数据。最终最小数被交换到起始的位置，这样第一个最小数的位置就排好了。
 * 继续重复上述过程，依次将第2.3...n-1个最小数排好位置。
 */

public class BubbleSort {

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
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                    System.out.println(Arrays.toString(a));
                }
            }
        }
    }
}
