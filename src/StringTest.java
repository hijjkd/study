import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.algs4.StdOut;

public class StringTest {

    public static void main(String[] args) {
        String stringNew = "574289CC" +                                                             //标记
                           "4F720DF6D40B117F8B3470D66008F60F184595C44C34F5D0C170B9696FBFD20A" +     //R
                           "AED330D5FE42CAA6FC05C8D06E5D48000EB074F688D40D625FB5639D2FB0EB73" +     //S
                           "9000";                                                                 //标记

        String stringOld = "57483044" +
                            "0220" +                                                        //标记
                           "2F1962DC2CB02F7867FD44954B4B0D0D63C3C076E8E8033F3346ABFBE7AEA3D4" +    //R
                           "0220" +                                                                //标记
                           "5CF85649E8E0CA8D3CE583B8126691FB77E73D29ED10D6EA78D92E4CFF89AE8B" +    //S
                           "471F9000";                                                             //标记



        StdOut.println(stringOld.substring(12,76));
        StdOut.println(stringOld.substring(80,144));

//        int length = "112233445566778811223344556677881122334455667788112233445566778811223344556677881122334455667788112233445566778811223344556677881122334455667788112233445566778811223344556677881122334455667788".length();
//        StdOut.println(length);
//        StdOut.println("返回"+ strinmLength);
//        byte array[]=new byte[5];
//
//        array="你好".getBytes();
//        String myString = Util.hexstr(array,false);
//        StdOut.println(myString);
    }

}
