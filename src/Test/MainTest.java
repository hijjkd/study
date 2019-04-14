package Test;

import edu.princeton.cs.algs4.StdOut;
import org.junit.Before;
import org.junit.Test;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.*;

public class MainTest {

    private static char c;

    public static void main(String[] args) {
//        StdOut.println("这是练习题里实践得得程序");
//            StdOut.println(c);
//        System.out.println(c == '\u0000');
//
//        StdOut.println(1+"10"+3+"2");
//
//        String[] strings ;
//        Scanner in = new Scanner(System.in);
//        strings = in.nextLine().split("");
//        for (String s:strings
//                )
//        {
//            StdOut.println(s);
//        }
//         int[][] a = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
//       StdOut.println(Find(7,a));
//        int[] a = {3,2,2,3,1,2,5,4,7,78};
//        removeElement(a,3);
//        int[][] a = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
//        StdOut.print(searchMatrix(a,5));
//        merge(new int[]{1,2,3,0,0,0},3,new int[]{2,3,5},3);
        //StdOut.println(test16());;
        StdOut.println(test16());
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m-- + n-- - 1;
        while (m >= 0 && n >= 0) {
            nums1[p--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }

        while (n >= 0)
            nums1[p--] = nums2[n--];
    }

    /*
    1.ArrayList删除元素后，剩余元素会依次向前移动，因此下标一直在变，size()也会减小；
    2.remove()方法调用的是remove(int index)，而不是remove(Object o)，因此删除的是index索引处的元素；
    该题具体流程：1.i=0,v=2,remove(2)删除掉了元素1，因此NumberList剩余元素为【2,4,3,5】；
    2.i=1,v=4,remove(4),此时线性表中只有四个元素，不可能删除索引为4的元素，因此会报数组下标越界异常。
    */
    @Test
    public void test1() {
        List<Integer> NumberList = new ArrayList<Integer>();
        NumberList.add(2);
        NumberList.add(4);
        NumberList.add(1);
        NumberList.add(3);
        NumberList.add(5);
        for (int i = 0; i < NumberList.size(); ++i) {
            int v = NumberList.get(i);//
            if (v % 2 == 0) {
                NumberList.remove(v);
            }
        }
        System.out.println(NumberList);
    }

    @Test
    public void test2() {
        StdOut.println(1 + "10" + 3 + "2");
    }


    @Before
    public void testBefore() {

    }

    @Test
    public void test3() {
        String[] strings;
        Scanner in = new Scanner(System.in);
        strings = in.nextLine().split("\\s+");
        for (String s : strings
                ) {
            StdOut.println(s);
        }
    }

    @Test
    public void test4() {
        int[][] array = {{1, 2, 3, 4}, {4, 5, 6, 4}, {7, 8, 9, 4}};
        StdOut.println(array.length);//3

        int[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        StdOut.println(array1.length);//3

        int[][] array2 = {};
        StdOut.println(array2.length);//4

        StdOut.println(array2 != null);
    }

//    @Test
//    public  boolean Find(int target, int[][] array) {
////            int rows = array.length-1;
////            int columns = array[0].length-1;
////            boolean flag = false;
////            if(array != null && rows >0 && columns > 0){
////                int row = 0;
////                int column = columns-1;
////                while(row <rows && column >=0){
////                    if(array[row][column] == target){
////                        flag = true;
////                        break;
////                    }else if(array[row][column] >target)
////                        --column;
////                    else
////                        ++row;
////                }
////            }
////            return false;
//        int len = array.length-1;
//        int i = 0;
//        while((len >= 0)&& (i < array[0].length)){
//            if(array[len][i] > target){
//                len--;
//            }else if(array[len][i] < target){
//                i++;
//            }else{
//                return true;
//            }
//        }
//        return false;
//        }


//    public static int removeElement(int[] nums, int val) {
//        int fast = 0;
//        int slow = 0;
//        while(fast < nums.length){
//            if(nums[fast] != val){
//                nums[slow] = nums[fast];
//                fast++;
//                slow++;
//            }else
//                fast++;
//
//        }
//
//        return fast-slow-1;
//
//    }

    @Test
    public void test6() {
        String s = "quicksortexample";
        char[] chars = s.toCharArray();
        for (char c : chars) {
            StdOut.print(c - 'a' + 1 + " ");
        }
    }

    @Test
    public void test7() {
        StdOut.print(1 / 2);
        StdOut.print((byte) ('a'));
        Deque deque = new LinkedList();
        deque.push(0);
        deque.add(1);
        deque.add(2);
        deque.add(3);
        for (Object i : deque) {
            StdOut.print(i);

        }
    }

    @Test
    public void test8() {
        StdOut.print(1 ^ 2);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        //判断空
        //如果不为空，得出行列多少，便于运算。
        //从左上角开始，也就是0，j列比较，有以下两种情况
        //  1、如果target》左上角的值，因为行递增，不可能在左边，所以行++
        //  2、如果target《左上角，因为列递增，不可能在下边，列--
        //退出条件，相等则返回true，找到了右下角还没有找到的话，返回false


        //判断空
        // if(matrix == null || target == null)
        //         return false;

        //如果不为空，得出行列多少，便于运算。
        int rows = matrix.length;
        int colums = matrix[0].length;
        int i = 0, j = colums - 1;
        while (i < rows && j >= 0) {
            //从左上角开始，也就是0，j列比较，有以下两种情况

            if (target == matrix[i][j]) {
                return true;
            } else if (target > matrix[i][j]) {
                i++;

            } else if (target < matrix[i][j]) {
                j--;
            }
        }
        return false;

    }

    @Test
    public void test9() {
        int m = 9, n = 9;
        StdOut.print(m-- + n-- - 1);
    }


    public static int[] twoSum(int[] nums, int target) {
        //
        if (nums == null || nums.length < 2)
            return new int[]{-1, -1};


        int[] res = new int[]{-1, -1};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                res[0] = hashMap.get(target - nums[i]);
                res[1] = i;
            }
            hashMap.put(nums[i], i);

        }

        return res;
    }


    @Test
    public void test10() {
        StdOut.println(10 / 3);
        StdOut.print(13 / 5);
    }


    @Test
    public void test11() {
        StdOut.println("abc".indexOf('a'));//0
        StdOut.println("abc".indexOf('d'));//-1
        StdOut.println("abc".indexOf('c'));//2
        StdOut.println("abc".indexOf('c', 0));//2
        StdOut.println("abc".indexOf('c', 1));//2
        StdOut.println("abcc".indexOf('c', 2));//2
        StdOut.println("abcc".indexOf('c', 3));//3
        StdOut.println("abcc".indexOf("c", 3));//3


        StdOut.println("ABCD".substring(0, 1));//A                包含头不包含尾（包含左不包含右）
        //StdOut.println("ABCD".substring(0,5));//A  oob
        StdOut.println("ABCD".substring(0, 4));//ABCD

        //String a = "hello2";String b = "hello" + 2; System.out.println((a == b));//true
        //String a = "hello2"; String b = "hello";String c = b + 2;System.out.println((a == c));//false
        //String a = "hello2"; final String b = "hello";String c = b + 2;System.out.println((a == c));//true
    }


    @Test
    public void test12() {
        Stack<Character> stack = new Stack<>();

        StdOut.println(stack.size());//int值 栈内元素的个数 0

        StdOut.println(stack.push('a')); //入栈，并且返回入栈的元素

        StdOut.println(stack.size());//1

        StdOut.println(stack.peek());//a 返回栈顶元素,不出栈

        StdOut.println(stack.size());//1

        StdOut.println(stack.pop());//a 返回栈顶元素，出栈

        StdOut.println(stack.size());//0

        StdOut.println(stack.isEmpty());//判空，被synchronized修饰

        StdOut.println(stack.empty());

        StdOut.println(stack.search('b'));//查找栈内是否有该元素 ，没有时返回-1

        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        StdOut.println(stack.search('b'));//3               search,从栈顶开始，返回第一次匹配的位置
        StdOut.println(stack.search('d'));//1
        StdOut.println(stack.add('e'));
        StdOut.println(stack.peek());


    }

    @Test
    public void test13() {
        HashMap<
                Integer, Integer> map = new HashMap<>();

        char myChar = 'g';
        String myStr = Character.toString(myChar);
        System.out.println("String is: " + myStr);
        myStr = String.valueOf(myChar);
        System.out.println("String is: " + myStr);
    }


    /**
     * 观察结果我们发现，并没有执行System.out.println("i="+i)。这说明try语句块发生异常之后，try语句块中的剩余内容就不会再被执行了。
     */
    @Test
    public void test14() {
        try {
            int i = 10 / 0;
            System.out.println("i=" + i);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception");
            System.out.println("e.getMessage(): " + e.getMessage());
            System.out.println("e.toString(): " + e.toString());
            System.out.println("e.printllTrace():");
            e.printStackTrace();
        }
    }

    @Test
    public void test15() {
        //最终执行了finally语句块。
        try {
            int i = 10 / 0;
            System.out.println("i=" + i);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception");
            System.out.println("e.getMessage(): " + e.getMessage());
            System.out.println("e.toString(): " + e.toString());
            System.out.println("e.printStackTrace():");
            e.printStackTrace();
        } finally {
            System.out.println("run finally");
        }
    }

    /**
     * 如果finally中使用了return或者throw等终止方法的语句，则就不会跳回执行，直接停止。
     *
     * @return 4
     */
    public static int test16() {
        try {
            return 5;
        } catch (Exception e) {

        } finally {
            return 4;
        }
    }

    @Test
    public void test17() {
String a = new String("myString");
        String b = "myString";
        String c = "my" + "String";
        String d = c;
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
        System.out.println(b == d);


    }

    @Test
    public void test18() {
        int[] src = new int[]{1, 2, 3, 4, 5, 6};
        int[] des = new int[6];
        System.arraycopy(src, 2, des, 1, 3);
        for (int aa : des
                ) {
            StdOut.println(aa);

        }
    }

    @Test
    public void test19() {
        Map map = new HashMap();
        map.put(null, null);
    }

    @Test
    public void test20() {
        String a = "a";
        String b = "a";
        String c = new String("a");

        StdOut.println(a == b);
        StdOut.println(a == c);
    }

    int a = 0;

    @Test
    public void test21() {
        Runnable v = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    a++;
                    StdOut.println(a++);
                }
            }
        };
        Thread t1 = new Thread(v);
        Thread t2 = new Thread(v);
        //t1.start();
        t2.start();

    }

    @Test
    public void test22() {
        ReferenceQueue<String> queue = new ReferenceQueue<String>();
        PhantomReference<String> pr = new PhantomReference<String>(new String("hello"), queue);
        System.out.println(pr.get());

        Integer.parseInt("123");
    }

    @Test
    public void test23() {

        int int1 = 12;
        int int2 = 12;
        Integer Integer1 = new Integer(12);
        Integer Integer2 = new Integer(12);
        Integer Integer3 = new Integer(127);

        Integer a1 = 127;
        Integer b1 = 127;

        Integer a = 128;
        Integer b = 128;

        String s1 = "str";
        String s2 = "str";
        String str1 = new String("str");
        String str2 = new String("str");

        System.out.println("int1==int2:" + (int1 == int2));//true
        System.out.println("int1==Integer1:" + (int1 == Integer1));//
        System.out.println("Integer1==Integer2:" + (Integer1 == Integer2));
        System.out.println("Integer3==b1:" + (Integer3 == b1));
        System.out.println("a1==b1:" + (a1 == b1));
        System.out.println("a==b:" + (a == b));


        System.out.println("s1==s2:" + (s1 == s2));
        System.out.println("s1==str1:" + (s1 == str1));
        System.out.println("str1==str2:" + (str1 == str2));
    }

}
