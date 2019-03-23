package leetcode;

import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class isPalindrome9 {
/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

 示例 1:

 输入: 121
 输出: true
 示例 2:

 输入: -121
 输出: false
 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 示例 3:

 输入: 10
 输出: false
 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
    public static void main(String[] args) {
        StdOut.print(isPalindrome9(1221));

    }


    public static boolean isPalindrome9(int x) {
        if(x < 0)
            return false;


        String string = String.valueOf(x);
        char[] chars = string.toCharArray();
        int i=0;
        int j=chars.length-1;

        while (true){
            if(i==j || j<i)
                return true;

            else if(chars[i] ==chars[j]){
                i++;j--;
            }else break;


        }

        return false;

    }


    @Test
    public void test(){
        assertEquals(true, isPalindrome9(121));
        assertEquals(false, isPalindrome9(-121));
        assertEquals(true, isPalindrome9(0));
        assertEquals(true, isPalindrome9(1));
        assertEquals(false, isPalindrome9(1211));
        assertEquals(true, isPalindrome9(1221));
    }
}
