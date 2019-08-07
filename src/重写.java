/**
 重写 总结：
 1.发生在父类与子类之间
 2.方法名，参数列表，返回类型（除过子类中方法的返回类型是父类中返回类型的子类）必须相同
 3.访问修饰符的限制一定要大于被重写方法的访问修饰符（public>protected>default>private)
 4.重写方法一定不能抛出新的检查异常或者比被重写方法申明更加宽泛的检查型异常

 */
public class 重写 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Son s = new Son();
        s.sayHello();
    }

    public void sayHello() {
        System.out.println("Hello "+重写.class.getName());
    }
}

class Son extends 重写 {

    @Override
    public void sayHello() {
        super.sayHello();
        // TODO Auto-generated method stub
        System.out.println("hello by " + Son.class.getName());
    }

}