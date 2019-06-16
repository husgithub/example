package com.example.suanfa._4_maopao;

/**
 * 冒泡排序，思想：
 * ①每次比较相邻的数，升序时，将左边大的数与右边相邻位置数互换位置
 * ②将最大的数移到最后需要比较array.length - 1次，以后每趟次数会减一
 */
public class MaoPao {

    /**
     * 从小到大排序
     *
     * @param array
     */
    public void sortFromSmallToLarge(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /**
     * 从大到小排序
     *
     * @param array
     */
    public void sortFromLargeToSmall(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {85, 9, 45, 123, 9, 5, 231, 3, 22, 66, 77};
        new MaoPao().sortFromSmallToLarge(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
}
