package Offer;

import org.junit.Test;

/**
 * 题目描述
 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 剑指offer4
 */
public class offer4查找有序矩阵中的数 {

    public static void main(String[] args) {
        int[][] array = new int[][]{{}};

        System.out.println(Find(9, array));

    }


    public static boolean Find(int target, int[][] array) {
        int m, n;
        if (array !=null &&array.length != 0 && array[0].length != 0) {
             m = array.length;
             n = array[0].length;
        } else
            return false;
        int i = 0;
        int j = n - 1;
        while (i < m && j >= 0) {
            if (target > array[i][j])
                i++;
            else if (target < array[i][j])
                j--;
            else return true;
        }

        return false;
    }




}
