package Test;

public class MyRun {

    public static void main(String[] args) throws InterruptedException {
        MyRun run = new MyRun();
        Thread bThread = new Thread(run.runnableB);
        bThread.start();
        Thread.sleep(100);
        Thread aThread = new Thread(run.runnableA);
        aThread.start();
    }


    private String lock = new String("");
    public Runnable runnableA = new Runnable() {

        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("begin wait");
                    lock.wait();
                    System.out.println("end wait");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    };
    public Runnable runnableB = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("begin notify");
                lock.notify();
                System.out.println("end notify");
            }
        }
    };
}