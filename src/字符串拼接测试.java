public class 字符串拼接测试 {
    /**
     * 测试使用不同方式进行字符串拼接时的耗时
     * currentTimeMillis精度不够的时候，可以使用nanoTime
     * @param args
     */
    public static void main(String[] args) {
        /**
         * format 占位符方式
         */

        String formatTest;
        long startTime = System.currentTimeMillis();
        formatTest = String.format("%S测试format%S", "A", "B");
        long useTime = System.currentTimeMillis() - startTime;
        System.out.println(formatTest + "耗时:" + useTime);
        System.out.println("===================================");




        /**
         * + 拼接方式
         */

        long startTime1 = System.currentTimeMillis();
        String s1 = "2" + "拼接字符串";
        long useTime1 = System.currentTimeMillis() - startTime1;
        System.out.println(s1 + "耗时" + useTime1);
        System.out.println("===================================");




        /**
         * StringBuilder.append() 方式
         */
        StringBuilder stringBuilder = new StringBuilder();
        long append = System.nanoTime();
        stringBuilder.append("append方式").append("拼接字符串");
        long useTime2 = System.nanoTime() - append;
        System.out.println(stringBuilder + "耗时" + useTime2);
        System.out.println("===================================");





        /**
         * String.value()耗时
         */
        long v = System.currentTimeMillis();
        String.valueOf(198276);
        long m = System.currentTimeMillis() - v;
        System.out.println("String.value()耗时" + m);


    }
}
