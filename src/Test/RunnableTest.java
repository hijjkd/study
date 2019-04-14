package Test;

import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdOut;

public class RunnableTest {
    public int a =0;
    public static void main(String[] args) {
        RunnableTest A = new RunnableTest();
        A.test();
    }

    private void test(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<50;i++){
                    a++;
                    StdOut.println(a);
                }
            }
        };
        Thread a = new Thread(r);
        Thread b = new Thread(r);
        Thread c = new Thread(r);
        Thread d = new Thread(r);
        Thread e = new Thread(r);
        c.start();
        a.start();
        b.start();
        d.start();
        e.start();

    }
}
