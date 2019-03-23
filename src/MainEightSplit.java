import java.util.Scanner;



public class MainEightSplit {

    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);



        while(in.hasNextLine()){
          String s =in.next();
            System.out.println(s.substring(1,9));//从开始到结束下标，不包括结束，即左闭右开
            System.out.print(s.substring(3));//从开始到字符串结束
    }
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