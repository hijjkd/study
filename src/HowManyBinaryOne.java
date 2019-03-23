public class HowManyBinaryOne {

    public static void main(String[] args) {
        System.out.print(numOfOne(1));

    }


    public static int numOfOne(int n){
        int result=0;
        String str = Integer.toBinaryString(n);
        char[] chars = str.toCharArray();
        for (char c: chars) {

            if(c == '1')
                result++;

        }

        return result;
    }
}
