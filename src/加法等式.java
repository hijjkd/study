public class 加法等式 {

    public static void main(String[] args) {
        for (int a = 0; a <9 ; a++) {
            for (int b = 0; b <9 ; b++) {
                for (int c = 0; c <9 ; c++) {
                    if(a*100+b*10+c+b*100+c*10+c==532 )
                        System.out.println(a+""+b+""+c);
                }
            }
        }
    }
}
