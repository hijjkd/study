import java.util.Collections;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();


        System.out.println(new StringBuffer(s).reverse().toString());
    }
}