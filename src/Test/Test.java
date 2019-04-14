package Test;

import java.util.Stack;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    private int a = 0;
    private AtomicInteger b = new AtomicInteger(0);

    public static void main(String[] args) {
        Test t = new Test();
        t.test3();
        //t.test2();
        try {
            t.finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    private  void test() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    synchronized (this) {
                        try {
                            //System.out.println(Thread.currentThread().getName());
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        a++;
                        //System.out.println(a);
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + a);
                System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis());
            }
        };
        Thread t1 = new Thread(r, "t1");
        Thread t2 = new Thread(r, "t2");
        Thread t3 = new Thread(r, "t3");
        t1.start();
        t2.start();
        t3.start();
    }

    private void test2() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    for (int i = 0; i < 50; i++) {
                        try {
//                            System.out.println(Thread.currentThread().getName());
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        a++;
//                        System.out.println(a);
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + a);
                System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis());
            }
        };
        Thread t1 = new Thread(r, "s1");
        Thread t2 = new Thread(r, "s2");
        Thread t3 = new Thread(r, "s3");
        t1.start();
        t2.start();
        t3.start();
    }

    private void test3() {
        Runnable r = () -> {
            for (int i = 0; i < 50; i++) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " <>" + b +" i = "+i);
                b.addAndGet(1);
                System.out.println(Thread.currentThread().getName() + " " + b);
            }
            System.out.println(Thread.currentThread().getName() + " final: " + b);
        };
        Thread t1 = new Thread(r, "s1");
        Thread t2 = new Thread(r, "s2");
        Thread t3 = new Thread(r, "s3");
        Thread t4 = new Thread(r, "s4");
        Thread t5 = new Thread(r, "s5");
        Thread t6 = new Thread(r, "s6");
        Thread t7 = new Thread(r, "s7");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        try {
            Thread.sleep(25000);
            System.out.println("7final: "+b);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void test4() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    a++;
                    System.out.println(Thread.currentThread().getName() + " " + a);
                }
//                System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis());
            }
        };
        Thread t1 = new Thread(r, "t1");
        Thread t2 = new Thread(r, "t2");
//        Thread t3 = new Thread(r, "t3");
        t1.start();
        t2.start();
//        t3.start();

    }
}
