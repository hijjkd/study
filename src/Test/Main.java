package Test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = myResult(n);
        System.out.println(result);

    }

    private static int myResult(int x) {
        int a = x / 10;
        int b = x % 10;
        int result = 1;
        if (a != 0) {
            if ((a % 2) == 1) {
                result = 4;
            } else {
                result = 6;
            }
        }

        int temp = 0;
        if (x == 1 || x == 2 || x ==3 || x ==4) {
            switch (x) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 6;
                case 4:
                    return 4;
            }
        } else {
            temp = temp + myResult(x / 5);
        }

        result = result * temp;
        if (b < 5) {
            for (int i = 1; i <= b; i++) {
                result *= i;
            }
        } else {
            for(int i = 3; i <= b; i++) {
                if (i == 5) continue;
                result *= i;
            }
        }

        return result % 10;
    }


}
