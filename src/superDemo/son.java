package superDemo;

public class son extends parent {
    public static void main(String[] args) {
        son son = new son();
        son.parentFunction();
    }

    @Override
    protected void parentFunction() {
        System.out.println("son");
        super.parentFunction();

    }

}
