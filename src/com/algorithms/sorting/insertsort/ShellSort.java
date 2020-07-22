package com.algorithms.sorting.insertsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author lilei
 * @date 2020-07-22 18:52
 * @apiNote 希尔排序
 * 时间复杂度：O(nlogn)~O(n^2)
 * 辅助空间：O(1)
 * 稳定性：不稳定
 * 如果数据序列基本有序，使用插入排序会更加高效。
 * 先预处理使其基本有序，然后使用插入排序
 * 基本思想：
 * 在要排序的一组数中，根据某一增量分为若干子序列，并对子序列分别进行插入排序。
 * 然后逐渐将增量减小,并重复上述过程。直至增量为1,此时数据序列基本有序,最后进行插入排序。
 */

public class ShellSort {
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
        shellSort(a);
    }

    private static void shellSort(int[] a) {
        for (int gap = a.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < a.length; i++) {
                insertSort(a, gap, i);
            }
        }
    }

    private static void insertSort(int[] a, int gap, int i) {
        System.out.println(Arrays.toString(a));
        int inserted = a[i];
        int j;
        for (j = i - gap; j >= 0 && inserted < a[j]; j -= gap) {
            a[j + gap] = a[j];
        }
        a[j + gap] = inserted;
    }

//    private static void shellSort(int[] a) {
//        int num = a.length / 2;
//        while (num >= 1) {
//            for (int i = num; i < a.length; i++) {
//                int temp = a[i];
//                int j = i - num;
//                while (j >= 0 && a[j] > temp) {
//                    a[j + num] = a[j];
//                    j = j - num;
//                }
//                a[j + num] = temp;
//                System.out.println(Arrays.toString(a));
//            }
//            num = num / 2;
//
//        }
//    }


//    private static void shellSort(int[] a) {
//        int num = a.length;
//        do {
//            num = num / 2;
//            for (int i = 0; i < num; i++) {
//                for (int j = i + num; j < a.length; j += num) {
//                    for (int k = j; k > i; k -= num) {
//                        if (a[k] < a[k - num]) {
//                            int temp = a[k - num];
//                            a[k - num] = a[k];
//                            a[k] = temp;
//                            System.out.println(Arrays.toString(a));
//                        } else {
//                            break;
//                        }
//                    }
//                }
//            }
//        } while (num != 1);
//    }


}
