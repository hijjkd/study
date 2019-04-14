package callBackDemo.mid;

public class XiaoWang implements EatRice{//小王

    //小王和小李一起去上网
    public void eatFood() {
        XiaoLi xl = new XiaoLi();
        //A调用B的方法
        xl.washFace("轻舞飞扬上网", this);
    }

    @Override
    public void eat(String bar) {
        System.out.println("小王和小李一起去" + bar);
    }
}
