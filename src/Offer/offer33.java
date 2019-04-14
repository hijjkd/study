package Offer;

import edu.princeton.cs.algs4.StdOut;

public class offer33 {

    public static void main(String[] args) {
        int[] a = new int[]{5,7,6,9,11,10,8};
       StdOut.println(verifySquenceOfBST(a,0,a.length-1));
    }

    private static boolean verifySquenceOfBST(int[] sequence,int start,int end){
        if(start>=end) return true;
        int root=sequence[end];
        int i=start;
        while(sequence[i]<root){
            i++;
        }
        int j=i;
        while(j<end){
            if(sequence[j]<root){
                return false;
            }
            j++;
        }
        boolean left=verifySquenceOfBST(sequence,start,i-1);
        boolean right=verifySquenceOfBST(sequence,i,end-1);
        return left&&right;
    }


}
