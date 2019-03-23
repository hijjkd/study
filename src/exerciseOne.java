import edu.princeton.cs.algs4.*;
import org.junit.Test;


public class exerciseOne {

    public static void main(String[] args) {
        test2();
    }

    public static  void  test(){
        System.out.println((0+5)/2);
        System.out.println(2.0e-6*100000000.1);
        System.out.println(true && false || true&&true );
        System.out.println((1+2.236)/2);
        System.out.println(1+2+3+4.0);
        System.out.println(4.1>=4);
        System.out.println(1+2+"3");
    }


    public static  void  test1(){
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15 ; i++) {
            StdOut.println(f);
            f = f+g;
            g = f-g;
        }
    }


    @Test
    public static  void  test2(){
        StdOut.println('b');
        System.out.println('b');
        StdOut.println('b'+'c');
        StdOut.println(('a'+4));
    }
}
