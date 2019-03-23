

import java.util.Scanner;

public class LinkTwoString
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        linkTwoString(str1,str2);

    }


    public  static void linkTwoString(String str1,String str2){

      while((str1.substring(str1.length() - 1)).equals(str2.substring(0, 1))) {
          if (str1.length() != 0)
                str1 = str1.substring(0, (str1.length() - 1));
          else str1 =null;
          if(str2.length()!=0)
                str2 = str2.substring(1);
            else str2 =null;
            }
        if (str1.length() == 0)
            System.out.println(str2);
        else if (str2.length() == 0)
            System.out.println(str1);
        else if(str1.length()==0 & str2.length()==0 )
            System.out.println("wu");
        else
            System.out.println(str1+str2);
        }






}
