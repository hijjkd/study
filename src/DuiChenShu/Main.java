package DuiChenShu;

import edu.princeton.cs.algs4.StdOut;

public class Main {
    public static void main(String[] args){
        for(int n=1;n<256;n++){
            char[] s = String.valueOf(n*n).toCharArray();
            for(int i=0;i<s.length/2;i++){
                if(s[i]!=s[s.length-1-i]){
                    break;
                }System.out.println(n*n);
            }
        }
    }

    public static boolean isDuiChenShu(String string){
        for(int n=1;n<256;n++){
            char[] s = String.valueOf(n*n).toCharArray();
            for(int i=0;i<s.length/2;i++){
                if(s[i]!=s[s.length-1-i]){
                    break;
                }System.out.println(n*n);
                ;
            }
        }
        return true;
    }
}
