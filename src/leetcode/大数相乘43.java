package leetcode;

/**
 * 思路 https://blog.csdn.net/kangkanglou/article/details/79894208
 */
public class 大数相乘43 {
    public static void main(String[] args) {
        System.out.println(multiply("0", "2"));
        System.out.println(multiply("13", "2"));
        System.out.println(multiply("11111111111111111111111111111111111111111", "2"));
        System.out.println(multiply("222", "2"));
        System.out.println(multiply("334234", "2"));
        System.out.println(multiply("2342345234523", "34562576605545645645646"));
        System.out.println(multiply("0", "0"));

    }

    public static String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + result[p2];

                result[p1] += sum / 10;
                result[p2] = sum % 10;

            }

        }

        StringBuilder sb = new StringBuilder();
        for (int p : result) {
            if (!(sb.length() == 0 && p == 0))
                sb.append(p);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}