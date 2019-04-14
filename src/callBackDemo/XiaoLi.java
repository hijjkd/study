package callBackDemo;

public class XiaoLi{//小李
    public void washFace()  {
        int n =10;
        for (int i = 0; i < n; i++) {
            System.out.println("小李要洗漱");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        XiaoMing xm = new XiaoMing();
        //B调用A的方法
        xm.eat();//洗漱完后，一起去吃饭
    }
}

