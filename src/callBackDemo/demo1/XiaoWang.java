package callBackDemo.demo1;

public class XiaoWang implements CallBack {
    private XiaoLi li;

    public XiaoWang(XiaoLi li){
        this.li = li;
    }

    /**
     * 小王通过这个方法去问小李的问题
     * @param question  就是小王要问的问题,1 + 1 = ?
     */
    public void askQuestion(final String question){
        //这里用一个线程就是异步，
        new Thread(new Runnable() {
            @Override
            public void run() {
                /**
                 * 小王调用小李中的方法，在这里注册回调接口
                 * 这就相当于A类调用B的方法C
                 */
                li.executeMessage(XiaoWang.this, question);
            }
        }).start();

        //小网问完问题挂掉电话就去干其他的事情了，诳街去了
        play();
    }

    public void play(){
        System.out.println("我要逛街去了");
    }


    @Override
    public void solve(String result) {
        System.out.println("小李告诉小王的答案是--->" + result);
    }
}
