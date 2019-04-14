package Offer;

import java.util.ArrayList;
import java.util.HashMap;

public class offer11 {

    //时间复杂度为0n
    public int minNumberInRotateArray(int[] array) {
        int result = 0;
        if (array.length < 0 || array == null) {
            return result;
        }
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (temp > array[i])
                return array[i];
        }
        return result;

    }


}
