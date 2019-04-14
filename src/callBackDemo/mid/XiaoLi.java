package callBackDemo.mid;

public class XiaoLi{//小李
    public void washFace(String food,EatRice er) {
        System.out.println("小李要洗漱");
        //B调用了A的方法
        er.eat(food);
    }
}