package Test;

import edu.princeton.cs.algs4.StdOut;

public class StopThread {


    public static void main(String[] args) {
        Thread my = new  MyThread();
        my.start();
    }

    public static class MyThread extends Thread {
        public volatile boolean exit = false;

        public void run() {
            int i = 0;
            while (!exit) {
                // do something
                StdOut.println(i++);
//                if(i==100)
//                    exit = true;
            }
        }
    }
}
