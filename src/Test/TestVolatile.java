package Test;

public class TestVolatile {
    public static volatile int inc = 0;
    public static void increase() {
        inc++;
    }

    public static void main(String[] args) {
        final TestVolatile test = new TestVolatile();
        for(int i=0;i<10;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<1000;j++)
                        test.increase();
                };
            }.start();
        }

        while(Thread.activeCount()>1)
            Thread.yield();
        System.out.println(test.inc);
    }
}
