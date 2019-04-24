package Offer;

import java.util.HashMap;

public class offer3数组中的重复数字 {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public static boolean duplicate(int numbers[], int length, int[] duplication) {
        if(length == 0){
            duplication[0]=-1;
            return false;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < numbers.length ; i++) {
            if (hashMap.containsKey(numbers[i])) {
                duplication[0] = numbers[i];
                return false;
            } else
                hashMap.put(numbers[i], null);

        }
        return true;

    }

    public static void main(String[] args) {
        int a[]= null;
        int b[]={-1};
        duplicate(a,0,b);
    }
}
