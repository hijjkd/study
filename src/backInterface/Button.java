package backInterface;


import edu.princeton.cs.algs4.StdOut;

class OthersClass {

    //别人写好的类需要用到我的方法体。就给我一个Callback接口，让我实现里面的方法。然后我使用这个类的时候就将该接口的一个实例对象传进去。
    public void Say(CallBack callback) {
        //设计的时候并不知道这个execute()方法体的内容。
        StdOut.println("os");
        callback.execute();

    }
}


