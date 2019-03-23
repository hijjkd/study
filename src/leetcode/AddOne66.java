package leetcode;

import java.util.Arrays;

public class AddOne66 {

    public int[] plusOne(int[] digits) {
        int n=digits.length-1;
        for(int i=n;i>=0;i--){
            if(digits[i]+1 < 10){
                digits[i]++;
                return digits;
            }else {
                digits[i] =0;
            }
        }
        int[] res=new int[digits.length+1];
        res[0]=1;
        return res;

    }
}
