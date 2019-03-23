package Test;


public class Synchronized {
    public void method1() {
        synchronized (this) {
            System.out.println("方法1获得ReentrantTest的锁运行了");
            method2();
        }
    }
    public void method2() {
        synchronized (this) {
            System.out.println("方法1里面调用的方法2重入锁,也正常运行了");
        }
    }
    public static void main(String[] args) {
        new Synchronized().method1();
    }
}
