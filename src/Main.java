import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in) ;
        int target = sc .nextInt();
        int k = sc.nextInt();
        int[] nums = new int[target];
        for(int i = 0;i<target;i++){
            nums[i] = sc.nextInt();
        }


       int  mum = maxSumNoLargerThan(nums,k);
       System.out.println(mum);
    }

    public static int maxSumNoLargerThan(int[] array, int k){
        int sum = 0, max = Integer.MIN_VALUE;
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        for(int i = 0; i < array.length; i++){
            sum += array[i];
            Integer min = set.ceiling(sum - k);
            if(min != null)
                max = Math.max(max, sum - min);
            set.add(sum);
        }
        return max;
    }
}
