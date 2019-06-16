package com.example.suanfa._2_xuanze;

import java.util.ArrayList;
import java.util.List;

/**
 * 选择排序
 */
public class XuanZe {

    public int getMinIndex(Integer[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
                return minIndex;
            }
        }
        return minIndex;
    }

    public int[] sort(Integer[] array) {
        int[] newArr = new int[array.length];
        int i = 0;
        while (array.length > 0) {
            int minIndex = getMinIndex(array);
            newArr[i] = array[minIndex];
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < array.length; j++) {
                list.add(array[j]);
            }
            list.remove(minIndex);
            array = list.toArray(new Integer[array.length - 1]);
            i++;
        }
        return newArr;
    }

    public static void main(String[] args) {
        Integer[] a = {12, 4, 5, 8};
        int[] sortArr = new XuanZe().sort(a);
        for (int i = 0; i < sortArr.length; i++) {
            System.out.print(sortArr[i] + ",");
        }
    }
}
