package com.wudi.bubble;

import java.util.Arrays;

/**
 * BelongsProject: LeetCode
 * BelongsPackage: com.wudi.bubble
 * Author: GuHui
 * CreateTime: 2025-09-26  09:36
 * Version: 1.0
 * 冒泡排序:j为未排序的数组下标
 */
public class BubbleSort {
    public static void sort(int[] arr) {
        bubble(arr, arr.length - 1);
    }

    private static void bubble(int[] arr, int j) {
        if (j == 0) {
            return;
        }
        for (int i = 0; i < j; i++) {
            if (arr[i] > arr[i + 1]) {
                int t = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = t;
            }
        }
        bubble(arr, j - 1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
