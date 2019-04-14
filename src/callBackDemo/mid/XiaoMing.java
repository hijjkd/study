package callBackDemo.mid;

public class XiaoMing implements EatRice {
    //小明和小李一起吃饭
    public void eatFood() {
        XiaoLi xl = new XiaoLi();
        //A调用B的方法
        xl.washFace("大龙虾", this);//this指的是小明这个类实现的EatRice接口
    }

    @Override
    public void eat(String food) {
        // TODO Auto-generated method stub
        System.out.println("小明和小李一起去吃" + food);
    }


}
