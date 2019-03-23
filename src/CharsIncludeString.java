import java.util.Scanner;

public class CharsIncludeString {


    public static void main(String[] args) {
        int result=0;
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            char[] chars =in.next().toCharArray();
            char[] cha = in.next().toCharArray();
            for (char chars1:chars){
                if (String.valueOf(chars1).equalsIgnoreCase(String.valueOf(cha[0]))){
                    result++;
                }
            }
            System.out.print(result);
            result =0;
            Math.pow(1,3);
        }



    }
}
