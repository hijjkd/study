import java.util.Scanner;

public class ReverseSentence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            StringBuffer sb = new StringBuffer(in.nextLine()).reverse();
            String[] str = sb.toString().split(" ");
            for (int i = 0;i<str.length-1;i++){
                System.out.print(new StringBuffer(str[i]).reverse().toString());
                System.out.print( " ");
            }
            System.out.print(new StringBuffer(str[str.length-1]).reverse().toString());

        }
    }




}
