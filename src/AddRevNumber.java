import org.junit.Test;
import sun.rmi.runtime.Log;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddRevNumber {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        int y = in.nextInt();
        rev(12301);


        Map<String, Object> businessParam = new HashMap<>();
        HashMap<String,Object> params = new HashMap<String,Object>();
        params.put("account", "hougan");
        params.put("password", "hougan");
        params.put("authority", 1);
        params.put("ds_category", 2);
        params.put("device","");
        businessParam.put("params",params);
        System.out.println(params.get("account"));

    }

    public static void rev(int num){
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        String afterreverse = sb.reverse().toString();
        System.out.println(Integer.valueOf(afterreverse));;
    }




}
