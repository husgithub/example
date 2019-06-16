package com.example.suanfa._2_xuanze;

/**
 * 选择排序
 * 思想：
 * ①找出数组中最小的数
 * ②将最小的数排到最前(也就是交换位置)，这样就排好一位数了
 * ③下一次只需要对剩下的数进行排序
 */
public class XuanZe {

    public int getMinIndex(Integer[] array, int startIndex) {
        int minIndex = startIndex;
        int small = array[minIndex];
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < small) {
                minIndex = i;
                small = array[i];
            }
        }
        return minIndex;
    }

    public void sort(Integer[] array) {
        int i = 0;
        while (i < array.length - 1) {
            //找出最小的数交换位置
            int minIndex = getMinIndex(array, i);
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
            i++;
        }
    }

    /**
     * 选择排序
     * 其他实现
     *
     * @param array
     */
    public void selectionSort(Integer[] array) {
        int i = 0;
        int j = i + 1;
        int minIndex = i;
        for (i = 0; i < array.length - 1; i++) {
            for (j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        Integer[] a = {12, 4, 5, 8};
        new XuanZe().selectionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }
}
