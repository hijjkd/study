package 继承类重写方法;

public class Main {
    public static void main(String[] args) {
A a = new A();
a.main(1);

    }

}


class A{
    void main(int a){
        test(2);
    }

    void test(int a){
        System.out.println(a);
    }
}


class B extends A{
    @Override
    void test(int a) {
        super.test(a);
        System.out.println(a);
    }


}
