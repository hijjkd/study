package 设计模式原则.单一职责;

public class Phone implements IScreenDisplay {
    public static void main(String[] args) {

        Phone phone = new Phone();
        phone.displayImage("displayImage");
        phone.displayText("displayText");
        phone.displayVideo("displayVideo");

    }
    @Override
    public void displayImage(String image) {
        System.out.println("displayImage:" + image);
    }

    @Override
    public void displayText(String text) {
        System.out.println("displayText:" + text);
    }

    @Override
    public void displayVideo(String video) {
        System.out.println("displayVideo:" + video);
    }
}



