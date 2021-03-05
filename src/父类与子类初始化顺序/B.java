package 父类与子类初始化顺序;

/**
 * 父类与子类实例化顺序
 * 1、构造方法
 * 2、空构造
 * 3、静态构造
 *
 * 子类实例化时，先初始化父类的静态方法，因为静态
 * 再走子类的静态
 * 父类的空构造
 * 父类的构造
 * 子类的空构造
 * 子类的构造
 *
 * 输出结果
 * class A static
 * class B static
 * I'm A class
 * class A
 * I'm B class
 * class B
 */


class A {
    public A() {
        System.out.println("class A");
    }

    {
        System.out.println("I'm A class");
    }

    static {
        System.out.println("class A static");
    }
}


class B extends A {
    public B() {
        System.out.println("class B");
    }

    {
        System.out.println("I'm B class");
    }

    static {
        System.out.println("class B static");
    }


    public static void main(String[] args) {
        new B();
    }

}