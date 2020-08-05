public class TestEnumValue {

    /**
     * 判断枚举类型 。equals

     */
    public enum P{
        P("1"),
        Q("2"),;

        public String value;

        P(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }
    }

    public static void main(String[] args) {
        System.out.println(P.P.Q.toString());
    }
}
