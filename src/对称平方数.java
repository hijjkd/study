import org.junit.Test;

/**
 * 打印所有不超过n（n<256）的，其平方具有对称性质的数。如11*11=121。
 *
 */
public class 对称平方数 {

    public static void main(String[] args) {
        for (int i = 1; i < 256; i++) {
            if (isP(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isP(int i) {
        char[] chars = String.valueOf(i * i).toCharArray();
        int k = chars.length - 1;
        for (int j = 0; j < chars.length / 2; j++) {
            if (chars[j] == chars[k])
                k--;
            else
                return false;
        }
        return true;
    }

    @Test
    public  void method() {
        for (int n = 1; n < 1; n++) {
            System.out.println(n);//空
        }

        for (int i = 0; i < 1 ; i++) {
            System.out.println(i);//0
        }

    }

}
