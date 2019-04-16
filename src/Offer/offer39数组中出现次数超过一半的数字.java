package Offer;

import java.util.Arrays;
import java.util.Collections;

public class offer39数组中出现次数超过一半的数字 {
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        Arrays.sort(array);
        int count = 0;
        int num = array[array.length / 2];
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                count++;
            }
        }
        if (count <= (array.length / 2)) {
            num=0;
        }
        return num;
    }
}
