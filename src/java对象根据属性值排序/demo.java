package java对象根据属性值排序;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * https://blog.csdn.net/jiangyu1013/article/details/53894218?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromBaidu-9.control&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromBaidu-9.control
 * https://blog.csdn.net/Leon_190/article/details/90753312?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.control&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.control
 */
public class demo {

    public static void main(String[] args) {
        //新建9个Order对象
        Order a = new Order(1,System.currentTimeMillis()-1);
        Order a1 = new Order(0,System.currentTimeMillis()+2);
        Order a2 = new Order(0,System.currentTimeMillis()-3);
        Order a3 = new Order(0,System.currentTimeMillis()+1);
        Order a4 = new Order(2,System.currentTimeMillis()+1);
        Order a5 = new Order(1,System.currentTimeMillis()+2);
        Order a6 = new Order(2,System.currentTimeMillis()+3);
        Order a7 = new Order(0,System.currentTimeMillis()+1);
        Order a8 = new Order(1,System.currentTimeMillis()-9);

        //将对象放入aList集合中
        List<Order> aList = new ArrayList<>();
        aList.add(a);
        aList.add(a1);
        aList.add(a2);
        aList.add(a3);
        aList.add(a4);
        aList.add(a5);
        aList.add(a6);
        aList.add(a7);
        aList.add(a8);
        System.out.println("服务端告诉顺序");
        System.out.println(aList);
        //输出结果:[Order{a='11', b='23'}, Order{a='15', b='21'}, Order{a='15', b='22'}, Order{a='13', b='24'}, Order{a='16', b='22'}, Order{a='18', b='28'}, Order{a='12', b='29'}, Order{a='19', b='27'}, Order{a='11', b='21'}]

        Comparator<Order> bya = Comparator.comparing(Order::getOrder);//按照a升序
        Comparator<Order> byb = Comparator.comparing(Order::getB);//按照b升序

        Collections.sort(aList,bya.thenComparing(byb));//将aList按照a字段先升序再按照B字段进行升序排列
        System.out.println("前端展示顺序");
        System.out.println(aList);
        //输入结果:[Order{a='11', b='21'}, Order{a='11', b='23'}, Order{a='12', b='29'}, Order{a='13', b='24'}, Order{a='15', b='21'}, Order{a='15', b='22'}, Order{a='16', b='22'}, Order{a='18', b='28'}, Order{a='19', b='27'}]

    }
}


 class Order {

    int a;
    long b;

    public Order() {
    }

    public Order(int a,  long b) {
        this.a = a;
        this.b = b;
    }

    public int getOrder() {
        return a;
    }

    public void setOrder(int a) {
        this.a = a;
    }

    public long getB() {
        return b;
    }

    public void setB(long b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Order{" +
                "订单申诉类型='" + a + '\'' +
                ", 下单时间='" + b + '\'' +
                '}';
    }
}