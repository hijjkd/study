package algorithms;

import edu.princeton.cs.algs4.StdOut;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public static void main(String[] args) {
        StdOut.println(numJewelsInStones("abs","ddd"));
    }

    public static int numJewelsInStones(String J, String S) {
        char[] stringJ = J.toCharArray();
        char[] stringS = S.toCharArray();

        Set set = new HashSet();
        int result = 0;

        if(stringS.length<=0)
        return 0;
        else {
            for (char s: stringJ){
                set.add(s);
            }

            for (char s:stringS){
                if(set.contains(s)){
                    ++result;
                }


            }

            return result;
        }
    }
}
