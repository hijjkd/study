/**
 重写 总结：
 1.发生在父类与子类之间
 2.方法名，参数列表，返回类型（除过子类中方法的返回类型是父类中返回类型的子类）必须相同
 3.访问修饰符的限制一定要大于被重写方法的访问修饰符（public>protected>default>private)
 4.重写方法一定不能抛出新的检查异常或者比被重写方法申明更加宽泛的检查型异常




 面试时，问：重载（Overload）和重写（Override）的区别？
 答：方法的重载和重写都是实现多态的方式，区别在于前者实现的是编译时的多态性，而后者实现的是运行时的多态性。
 重载发生在一个类中，同名的方法如果有不同的参数列表（参数类型不同、参数个数不同或者二者都不同）则视为重载；
 重写发生在子类与父类之间，重写要求子类被重写方法与父类被重写方法有相同的参数列表，有兼容的返回类型，比父类被重写方法更好访问，
 不能比父类被重写方法声明更多的异常（里氏代换原则）。重载对返回类型没有特殊的要求，不能根据返回类型进行区分。
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