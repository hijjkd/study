package SPtest;

public class main {

    public static void main(String[] args) {
        SPManager spManager = new SPManager();
        System.out.println(spManager.mBaseCIPSWrapper.getString("123"));
    }
}
