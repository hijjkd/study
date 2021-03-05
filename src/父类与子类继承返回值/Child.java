package 父类与子类继承返回值;

public class Child extends Parent {

    public Child() {
    }


    @Override
    protected boolean getHead() {
        System.out.println("child +false");
        return false;
    }
}
