public class 字符串拼接测试 {
    /**
     * 测试使用不同方式进行字符串拼接时的耗时
     * @param args
     */
    public static void main(String[] args) {
        /**
         * format
         */

        String test;
        long sTART = System.currentTimeMillis();
        test = String.format("%d测试format%d", 2, 3);
        long useTime = System.currentTimeMillis() - sTART;
        System.out.println(test + "耗时" + useTime);


        long join = System.nanoTime();
        String s1 = "2" + "拼接字符串";
        long useTime1 = System.nanoTime() - join;
        System.out.println(s1 + "耗时" + useTime1);


        StringBuilder stringBuilder = new StringBuilder();
        long append = System.nanoTime();

        stringBuilder.append(2).append("拼接字符串");

        long useTime2 = System.nanoTime() - append;
        System.out.println(stringBuilder + "耗时" + useTime2);

        int i = 9;
        System.out.println(9 + "fenz");


        long v = System.currentTimeMillis();
        String.valueOf(198276);
        long m = System.currentTimeMillis() - v;
        System.out.println("valueof耗时" + m);


    }
}
