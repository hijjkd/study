import java.util.*;

/**
 * 题目描述
 * 数据表记录包含表索引和数值，请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 * <p>
 * 输入描述:
 * 先输入键值对的个数
 * 然后输入成对的index和value值，以空格隔开
 * <p>
 * 输出描述:
 * 输出合并后的键值对（多行）
 * <p>
 * 示例1
 * 输入
 *
 * 4
 * 0 1
 * 0 2
 * 1 2
 * 3 4
 * 输出
 *
 * 0 3
 * 1 2
 * 3 4
 */
public class 华为合并表记录 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, Integer> map = new TreeMap<>();//TreeMap是一个有序树，默认正序。
        int nums = in.nextInt();//取得有几个值
        int temp;
        for (int i = 0; i < nums; i++) {//遍历nums次，一次输入。
            int key = in.nextInt();
            int value = in.nextInt();
            if (map.containsKey(key)) {//在输入的时候从判断是否包含key，包含的话取出temp=value,和当前值相加
                temp = map.get(key);
                map.put(key, value + temp);
            } else {//否则的话直接存入
                map.put(key, value);
            }
        }

        //当前map是一个有序的。
        Set<Integer> keySet = map.keySet();//得到所有key的set
        for (Integer resultKey : keySet) {
            System.out.println(resultKey + " " + map.get(resultKey));//打印输出
        }


    }


}
