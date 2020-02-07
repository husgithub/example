package com.example.suanfa._1_erfen;

/**
 * 二分查找法
 */
public class BinarySearchTest {

    private static final int[] array = new int[1025];

    static {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    public static int find(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (end - start) / 2 + start;
            if (arr[mid] > num) {
                end = mid - 1;
            } else if (arr[mid] < num) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int result = find(array, 1020);
        System.out.println(result);
    }
}
