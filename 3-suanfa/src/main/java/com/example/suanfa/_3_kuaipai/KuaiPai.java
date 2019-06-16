package com.example.suanfa._3_kuaipai;

import java.util.Arrays;

public class KuaiPai {

    public int[] quickSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int[] newArr = new int[arr.length];
        int middle = arr[0];
        int[] left = new int[0];
        int[] right = new int[0];
        for (int i = 1; i < arr.length; i++) {
            if (middle > arr[i]) {
                left = Arrays.copyOf(left, left.length + 1);
                left[left.length - 1] = arr[i];
            } else if (middle < arr[i]) {
                right = Arrays.copyOf(right, right.length + 1);
                right[right.length - 1] = arr[i];
            }
        }
        int[] leftRes = quickSort(left);
        int[] rightRes = quickSort(right);
        int ind = 0;
        for (int i = 0; i < leftRes.length; i++) {
            newArr[i] = leftRes[i];
            ind++;
        }
        newArr[ind++] = middle;
        for (int i = 0; i < rightRes.length; i++) {
            newArr[ind + i] = rightRes[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int size = 10000;
        int[] a = new int[size];
        for (int i = size; i > 0; i--) {
            a[size - i] = i - 1;
        }
        long start = System.currentTimeMillis();
        int[] sortArr = new KuaiPai().quickSort(a);
        for (int i = 0; i < sortArr.length; i++) {
            System.out.print(sortArr[i] + ",");
        }
        System.out.println();
        System.out.println("time:" + (System.currentTimeMillis() - start));
    }
}
