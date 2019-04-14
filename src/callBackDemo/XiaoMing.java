package callBackDemo;

public class XiaoMing {
    //小明和小李一起吃饭
    public void eatFood() {
        System.out.println("小李我们一起去是大虾把。");
        XiaoLi xl = new XiaoLi();
        //A调用B的方法
        xl.washFace();

    }

    public void eat() {
        System.out.print("小明和小李一起去吃大龙虾");
    }
}
