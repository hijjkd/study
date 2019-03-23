class Counter extends Thread {
    private static int i = 0;
    //method where the thread execution will start 
    public void  run(){
        //logic to execute in a thread
        while (i<100)
        System.out.println(i++);
    }

    //let’s see how to start the threads
    public static void main(String[] args){
        Thread t1 = new Counter();
        Thread t2 = new Counter();
        t1.start();  //start the first thread. This calls the run() method.
        t2.start(); //this starts the 2nd thread. This calls the run() method.
    }
}