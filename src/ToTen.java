import java.util.*;
public class ToTen{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int result = 0;
            int flag = 1;
            char[] cs = in.next().toCharArray();
            for(int i=cs.length-1;i>1;i--){
                //result += flag *get(cs[i]);
                result += flag *Integer.valueOf(String.valueOf(cs[i]));
                flag  *=16;
            //int m = Integer.valueOf(cs[i]);
            }

            System.out.println(result);
        }


    }

    public static int get(char c){
        switch (c){
            case '0':
                return 0;
            case '1':
                return 1;

            case '2':
                return 2;

            case '3':
                return 3;

            case '4':
                return 4;

            case '5':
                return 5;

            case '6':
                return 6;

            case '7':
                return 7;

            case '8':
                return 8;

            case '9':
                return 9;

            case 'A':
                return 10;

            case 'B':
                return 11;

            case 'C':
                return 12;

            case 'D':
                return 13;

            case 'E':
                return 14;

            case 'F':
                return 15;

            default:
                return 0;


        }

    }
}