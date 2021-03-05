package 单例构造方法赋值;

/**
 * 六种单例模式实现
 * https://www.runoob.com/design-pattern/singleton-pattern.html
 */
public class demo {

    public static void main(String[] args) {
        Person s = Person.getInstance("刘言曌", 20, "男");
        Person s1 = Person.getInstance("刘亦菲", 20, "女");

        System.out.println("单例的age"+s.getAge());
        System.out.println("单例的age"+s1.getAge());
    }
}

class Person {
    private String name;
    private int age;
    private String sex;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSex() {
        return sex;
    }
    private Person(String name, int age, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
    private static Person s;
    public static Person getInstance(String name, int age, String sex) {
        if (s == null) {
            s = new Person(name, age, sex);
            System.out.println("创建成功：" + "name=" + name + ",age=" + age + ",sex=" + sex);
            return s;
        }
        System.out.println("创建失败，您已经创建了一个对象啦");
        return null;
    }
}
