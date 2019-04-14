package callBackDemo.high;

import callBackDemo.mid.EatRice;

public class XiaoLi{//小李

    protected EatRice er;

    public void setEatRiceListener(EatRice er, String food) {
        this.er = er;
        washFace(food);
    }

    public void washFace(String food) {

        System.out.print("小李要洗漱");

        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                try {
                    //小李洗漱的同时小明玩手机，开启线程实现异步
                    play();

                    Thread.sleep(10000);
                    System.out.print("10秒后 ");
                    //B调用A的方法
                    er.eat(food);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }).start();
    }

    //小明玩手机
    public void play() {
        System.out.println(" 小明要玩手机");
    }
}
