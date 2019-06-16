package com.example.suanfa._3_kuaipai;

/**
 * 快排，通过改变内容的方式，不产生新的数组
 */
public class KuaiPai2 {

    public void quickSort(int[] arr, int low, int height) {
        if (low >= height) {
            return;
        }
        int i = low;
        int j = height;
        int middle = arr[low];
        while (i < j) {
            //j-- 在上，i++在下，防止i多加一位
            while (arr[j] >= middle && i < j) {
                j--;
            }
            while (arr[i] <= middle && i < j) {
                i++;
            }
            if (i < j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        arr[low] = arr[i];
        arr[i] = middle;
        quickSort(arr, low, i - 1);
        quickSort(arr, i + 1, height);
    }

    public static void main(String[] args) {
        int size = 10000;
        // int[] b = {4, 2, 3, 1};
        int[] a = new int[size];
        for (int i = size; i > 0; i--) {
            a[size - i] = i - 1;
        }
        long start = System.currentTimeMillis();
        new KuaiPai2().quickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
        System.out.println("time:" + (System.currentTimeMillis() - start));
    }
}
