import edu.princeton.cs.algs4.StdOut;

public class 反转单词顺序列 {
    public static void main(String[] args) {
        StdOut.println(Solution.ReverseSentence(" "));
    }



    public static class Solution {


        public static String ReverseSentence(String str) {
            if (str == null) {
                return null;
            }
            if (str.trim().equals("")) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str);
            StringBuilder result = new StringBuilder("");
            String ss = null;
            String[] strings = sb.reverse().toString().split(" ");
            for (int i = 0; i < strings.length - 1; i++) {
                ss = result.append(new StringBuilder(strings[i]).reverse().toString() + " ").toString();

            }
            return result.append(new StringBuilder(strings[strings.length - 1]).reverse().toString() + " ").toString();

        }
    }
}
