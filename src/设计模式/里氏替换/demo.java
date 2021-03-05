package 设计模式.里氏替换;


public class demo {
    public static void main(String[] args) {
        Person coke = new Person("库克");
        coke.setPhone(new ApplePhone());

        Person laoluo = new Person("老罗");
        laoluo.setPhone(new TPhone());

        Person bill = new Person("比尔盖茨");
        bill.setPhone(new NokiaPhone());

        coke.communicate();
        laoluo.communicate();
        bill.communicate();
    }
}



abstract class AbsPhone {
    /**
     * 使用
     */
    public abstract void use();
}


/**
 * 诺基亚
 */
class NokiaPhone extends AbsPhone {

    @Override
    public void use() {
        System.out.println("砸核桃 实用户");
    }
}

/**
 * 锤子
 */
class TPhone extends AbsPhone {

    @Override
    public void use() {
        System.out.println("锤子 情怀户");
    }
}

/**
 * 苹果
 */
class ApplePhone extends AbsPhone {

    private void ringing() {
        System.out.println("先让苹果特有铃声响一阵...呜呜呜");
    }

    @Override
    public void use() {
        ringing();
        System.out.println("苹果 zhuang bi 专业户");
    }
}


class Person {

    AbsPhone phone;
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void setPhone(AbsPhone phone) {
        this.phone = phone;
    }

    void communicate() {
        System.out.println(name + "掏出手机了...");
        phone.use();
    }
}
