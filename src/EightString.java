import java.util.Scanner;

public class EightString {
    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);


            String s = in.next();
            String t = in.next();
            eight(s);
            eight(t);


    }

    public static void eight(String s){
        if(s.length() == 0)
            return ;
        else while(s.length()>8){
            System.out.print(s.substring(0,8));
            System.out.println();
            s = s.substring(8,s.length());
        }

        System.out.print(s);
        for (int i=0;i<8-s.length();i++){
            System.out.print("0");
        }
        System.out.println();
    }
}
