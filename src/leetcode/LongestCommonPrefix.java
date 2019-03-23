package leetcode;

import edu.princeton.cs.algs4.StdOut;

public class LongestCommonPrefix {
    /**
     * 编写一个函数来查找字符串数组中的最长公共前缀。

     如果不存在公共前缀，返回空字符串 ""。

     示例 1:

     输入: ["flower","flow","flight"]
     输出: "fl"
     示例 2:

     输入: ["dog","racecar","car"]
     输出: ""
     解释: 输入不存在公共前缀。
     说明:

     所有输入只包含小写字母 a-z 。
     * @param args
     */


    //思路。
    public static void main(String[] args) {
        String[] strings = {"ai","wai"};
        longestCommonPrefix(strings);
        StdOut.print("123".substring(0,0));
    }
    public static String longestCommonPrefix(String[] strs) {
        int n = strs.length;//输入的字符串数组的长度
        if(n==0||strs==null){
            return "";
        }

        String prefix = strs[0];
        for(int i=1;i<n;i++){
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty())
                    return "";
            }

        }

        return prefix;

    }
}
