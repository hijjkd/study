package leetcode;

/**
 * 给定一个整数 n，返回 n! 结果尾数中零的数量。

 示例 1:

 输入: 3
 输出: 0
 解释: 3! = 6, 尾数中没有零。
 示例 2:

 输入: 5
 输出: 1
 解释: 5! = 120, 尾数中有 1 个零.
 说明: 你算法的时间复杂度应为 O(log n) 。
 */
public class TrailingZeroes172 {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(25));
    }

    /**
     * n!是由于2*5来的，由于2的数量比5多，所以零的数量由5决定。
     * 如n=15 15、14、13、12、11、10、9、8、7、6、5、4、3、2、1.分别由15、10、5来决定的，所以/5看出由几个5.
     * 当m=n/5大于5时，这个数m乘以2仍然构成10.
     * 所以依次除以5，直到m=0
     * @param n 数入，求n!中末尾有几个0
     */
    private static int trailingZeroes(int n){
        int sum =0;
        int num =n;
        while (num != 0){
            num /= 5;
            sum += num;

        }
        return  sum;
    }
}
