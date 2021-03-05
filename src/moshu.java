import java.util.*;

public class moshu {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Map<Integer,String> map = new HashMap();
//        String line = "";
//        while (!line.equals("737720233")) {
//            line = sc.next();
//            map.add(line);
//        }
//
////        int sum = 0;
//        for (String l : list) {
////            int m = Integer.parseInt(l);
////            sum = sum + m;
//            System.out.println(l);
//        }

        Map<String, Integer> map = new HashMap();
        System.out.println("输入");
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (!input.equals("737720233")) {
            input = sc.next();
            Integer count = map.get(input);
            map.put(input, count == null ? 1 : count + 1);

        }

//        for (String key : map.keySet()
//        ) {
//            System.out.println(key + " " + map.get(key));
//
//        }


        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet()); //转换为list

        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
             
            }
        });

        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i).getKey().contains("com."))
            System.out.println("产生方法："+list.get(i).getKey() + "======统计个数： " + list.get(i).getValue());
        }
    }
}
