package backInterface;

public class MyClass {
    public static void main(String[] args) {

        OthersClass others = new OthersClass();

        others.Say(new CallBack() {
            @Override
            public void execute() {
                System.out.println("这个方法体是我自己写的，方法名是别人固定的。我所在的类在其他类里面，所以是内部类。我所在的类又没有名称，所以我是匿名的，请叫我所在类为  匿名内部类");

            }
        });
    }

}
