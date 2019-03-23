import java.net.MalformedURLException;
import java.net.URL;

public class Example {
    String str=new String("hello");
    char[]ch={'a','b'};
    public static void main(String args[]){
        Example ex=new Example();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
        int count = 0;
        count = count++;
        System.out.println(count);


        String x="7";
        int y = 2;
        int z=2;
        System.out.print(x+y+z);
    }
    public void change(String str,char ch[]){
        str="test ok";
        ch[0]='c';

        try {
            URL u =new URL("http://www.123.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
