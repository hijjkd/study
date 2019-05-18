public class 可作为内部类demo {
    double d1 = 1.0;
    static double d2 = 2.0;

    /**
     * 内部类的静态方法不能引用外部类的非静态变量。
     * 因为有两个.class文件。static在类加载的时候就有了，非静态变量需要new出来对象，所以不能引用
     */
    class InnerClass0 {
        public static double methoda() {
            return d1;
        }
    }

    /**
     * 原因同InnerClass0
     */
    public class InnerClass1 {
        static double methoda() {
            return d1;
        }
    }

    private class InnerClass2 {
        double methoda() {
            return d1;
        }
    }

    /**
     * java里面static一般用来修饰成员变量或函数。但有一种特殊用法是用static修饰内部类，普通类是不允许声明为静态的，只有内部类才可以。
     * 被static修饰的内部类可以直接作为一个普通类来使用，而不需实例一个外部类
     * 但是同样不能引用外部类的非静态变量,即return d2就可以。
     * https://www.cnblogs.com/a8457013/p/8078826.html
     */
    static class InnerClass3 {
        protected double methoda() {
            return d1;
        }
    }

    /**
     * 内部类可以是一个抽象类
     * 抽象类不能直接实例化，并且对抽象类使用 new 运算符是编译时错误。
     */
    /**
     * 只要知道内部类的作用就知道怎么用了
     * 1.内部类可以很好的实现隐藏,也就是封装性。一般的非内部类，是不允许有 private 与protected权限的，但内部类可以
     * 2.内部类拥有外围类的所有元素的访问权限
     * 3.可是实现多重继承
     * 4.可以避免修改接口而实现同一个类中两种同名方法的调用
     */
    abstract class InnerClass4 {
        public abstract double methoda();
    }
}
