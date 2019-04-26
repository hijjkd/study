package Offer;

/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class offer65不用加减乘除做加法 {
    public static void main(String[] args) {
//        System.out.println(intAdd(1, 2));
//        System.out.println(intAdd(1, -2));
//        System.out.println(intAdd(1, 0));
//        System.out.println(intAdd(0, 0));
        System.out.println(intAdd(4,4));
    }

    public static int intAdd(int a, int b) {
        int sum, carry;
//        do {
//            sum = a ^ b;
//            carry = (a & b) << 1;
//
//            a = sum;
//            b = carry;
//        } while (b != 0);

        while (b!=0){
            sum = a ^ b;
            carry = (a & b) << 1;
            a = sum;
            b = carry;
        }
        return a;
    }
}
