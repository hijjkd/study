package leetcode;

import edu.princeton.cs.algs4.StdOut;

public class AddBinary67 {

    public static void main(String[] args) {
        StdOut.println(addBinary("1","2"));
    }
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int sum = 0;
        int i=a.length()-1;
        int j=b.length()-1;
        while (i>=0 || j>=0 || sum!=0){
            if(i>=0){
                sum+=a.charAt(i--)-'0';
            }
            if(j>=0){
                sum+=a.charAt(j--)-'0';
            }
            result.append(sum%2);
            sum/=2;
        }

              result.append(1);
        return result.reverse().toString();
    }
}
