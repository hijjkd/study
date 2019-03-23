package XiaoMingBuXiHuanDeZiMu;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
//        System.out.println(scanner.next());
        System.out.println(islike(scanner.next()) ? "Likes" : "Dislikes");

        scanner.close();
    }

    private static boolean islike(String word) {
        char ws[] = word.toCharArray();
        Set<String> set = new HashSet<>();

        if(ws.length > 0 && !Character.isUpperCase(ws[0]))
            return false;

        for (int i = 1; i < ws.length; i++) {
            if(!Character.isUpperCase(ws[i]))
                return false;
            if(ws[i] == ws[i - 1])
                return false;
            for (int j = i + 1; j < ws.length; ++j){
                if(set.contains(ws[i] + "" +ws[j]))
                    return false;
            }
            for (int j = 0; j < i; ++j){
                set.add(ws[j] + "" +ws[i]);
            }
        }

        return true;

    }
}