package XiaoMingBuXiHuanDeZiMu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] ch = s.toCharArray();
        getRes(ch);
    }

    public static void getRes(char[] ch) {
        int n = ch.length;
        boolean flag = false;

        if (n == 1) {
            if (ch[0] >= 'A' && ch[0] <= 'Z') {
                System.out.println("Likes");
                return;
            } else {
                System.out.println("Dislikes");
                return;
            }

        } else {
            for (int i = 0; i < n - 1; i++) {
                if (ch[0] >= 'A' && ch[0] <= 'Z') {
                    if (ch[i] == ch[i + 1]) {
                        System.out.println("Dislikes");
                        return;
                    } else {
                        flag = true;
                    }
                } else {
                    System.out.println("Dislikes");
                    return;
                }
            }

            if (flag) {
                System.out.println("Likes");
                return;
            }
        }
    }
}