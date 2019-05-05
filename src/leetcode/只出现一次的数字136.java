package leetcode;


/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

 说明：

 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

 示例 1:

 输入: [2,2,1]
 输出: 1
 示例 2:

 输入: [4,1,2,1,2]
 输出: 4
 */
public class 只出现一次的数字136 {
    public static void main(String[] args) {

        只出现一次的数字136 clas = new 只出现一次的数字136();
        int[] a = new int[]{1,2,2};
        System.out.println(clas.singleNumber(a));
    }


    /**
     *  //异或运算，相同为零，相异为1.用位运算，因为有偶数个1，得出o，0和任何数异或还是它本身，所以就找到了那个单独的数。
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {

        int length = nums.length;
        if(length ==0)
            return -1;

        int result = nums[0];
        for (int i = 1; i < length; i++) {
            result ^= nums[i];
        }

        return result;
    }
}
