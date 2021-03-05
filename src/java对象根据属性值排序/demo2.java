package java对象根据属性值排序;


import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Comparator;
        import java.util.List;
/**
 * 对教师进行先id后salary的从小到大的排序
 * @author jianan
 */
//老师属性
class Teacher{
    public int id = 0;      //编号
    public long salary = 0;  //薪水
    public Teacher(int id, long salary){
        this.id = id;
        this.salary = salary;
    }

    public String toString() {
        return "\nid编号:" + id + "  " + "salary薪水:" + salary;
    }
}


//比较器
@SuppressWarnings("rawtypes")
class TeacherComparator implements Comparator{
    public int compare(Object o1, Object o2) {
        Teacher t1 = (Teacher)o1;
        Teacher t2 = (Teacher)o2;

        int result = t1.id > t2.id ? 1 : (t1.id == t2.id ? 0 : -1);

        return  result == 0 ? (t1.salary > t2.salary ? 1 : -1) : result;
    }
}



public class demo2{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        List<Teacher> listTeacher = new ArrayList<Teacher>();
        listTeacher.add(new Teacher(2, System.currentTimeMillis()+1));
        listTeacher.add(new Teacher(1, System.currentTimeMillis()+7));
        listTeacher.add(new Teacher(3, System.currentTimeMillis()+7));
        listTeacher.add(new Teacher(4, System.currentTimeMillis()+9));
        listTeacher.add(new Teacher(3, System.currentTimeMillis()+4));
        listTeacher.add(new Teacher(3, System.currentTimeMillis()+2));
        listTeacher.add(new Teacher(5, System.currentTimeMillis()+4));
        listTeacher.add(new Teacher(2, System.currentTimeMillis()+5));
        listTeacher.add(new Teacher(6, System.currentTimeMillis()+6));
        listTeacher.add(new Teacher(7, System.currentTimeMillis()+7));
        listTeacher.add(new Teacher(3, System.currentTimeMillis()+4));
        System.out.println("\n排序前结果如下:");
        System.out.println(listTeacher);
        System.out.println("\n排序后结果如下:");
        Collections.sort(listTeacher, new TeacherComparator());
        System.out.println(listTeacher);
    }

}





