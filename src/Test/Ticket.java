package Test;

import edu.princeton.cs.algs4.StdOut;

public class Ticket implements Runnable {
    private int num = 10;


    @Override
    public synchronized void run() {
        while (true){
            if(num>0){
                try {
                    Thread.sleep(10);
                }catch (InterruptedException e){

                }
                StdOut.println(Thread.currentThread().getName()+"-----Sale----"+ num--);
            }
        }
    }
}
