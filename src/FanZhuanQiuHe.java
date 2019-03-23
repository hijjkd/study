import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;
public class FanZhuanQiuHe {

    public static void main(String[] args) {
//       StdOut.println(Main());
       StdOut.print(Integer.MAX_VALUE > Math.pow(10,9));
    }

    private static int Main(){

        Scanner in = new Scanner(System.in);
        int nums = in.nextInt(); //一共有多少数字
        int jump = in.nextInt();//每隔多少个字转变符号，并且从-号开始
        int j=jump;
        int result = 0;
        int flag = 0;
        for(int i=1;i<=nums;i++){
            if(flag%2 == 0)
                result -= i;
            else
                result += i;
            jump--;
            if(jump == 0){
                flag++;
                jump=j;
            }


        }
        return result;
    }


}
