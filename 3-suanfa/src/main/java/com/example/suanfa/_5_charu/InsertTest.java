package com.example.suanfa._5_charu;

/**
 * 插入排序
 * 思想：
 * ①首先在一组数中确定一个中间数保证它的左边的数都是有序的（当然这没法保证，除非这个中间数是第二位）
 * ②将中间数提取出，这里使用临时变量 A 保存，此时数组空出一位
 * ③将 A 与左边的数依次对比，如果左边的数大则将左边的数右移一位，直到找到小于 A 的数 B ，
 * 那么 A 应该放在 B 的右边（即将 A 插入到B的右边），此时完成了一趟排序
 * ④将中间数右移一位，因为此时已经可以保证这个数的左边都是有序的了
 * ⑤依次执行上面1~3的操作直到游标到达数组的最后一位
 */
public class InsertTest {

    public void insertSort(int[] array) {
        int outer;    //确定游标位置，这里默认为1，表示array[1]都是有序的(只有一位，肯定有序)
        int inner;
        for (outer = 1; outer < array.length; outer++) {
            inner = outer;
            int temp = array[inner];   //保存游标所在位置的数
            //如果前面的数大于所标记的数 A 则右移，
            for (; inner > 0 && array[inner - 1] > temp; inner--) {
                array[inner] = array[inner - 1];
            }
            //循环结束则表示已经找到小于A 的数（即array[inner-1]），所以 A 应该排在它的右边即inner位置
            array[inner] = temp;
        }
        //一趟排序结束，游标右移，将中间数定为下一位
    }

    public static void main(String[] args) {
        int[] array = {85, 9, 45, 123, 9, 5, 231, 3, 22, 66, 77};
        new InsertTest().insertSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
}
