import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class addNullTest {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            strings.add(null);
        }


//        System.out.println(strings.);
//        getMemorySize();
//        make();


        File f = new File(addNullTest.class.getResource("/").getPath());
        System.out.println(f);
    }


    public  static  void  make(){
        try {
            //建立一个File对象
            File file = new File("/Users/liunan/IdeaProjects/study/out/production/studytest.json");
            //判断该文件的所属文件夹存不存在，不存在则创建文件夹
            if(!file.getParentFile().exists()){
                file.getParentFile().mkdirs();
            }
            //创建字符流（使用字节流比较麻烦）
            FileWriter fw = new FileWriter(file);
            //判断file是否存在
//            if(!file.exists()){
//                //如果不存在file文件，则创建
//                file.createNewFile();
//                fw.write(null);
//            }else{
//                //如果存在该file，可以根据情况来重写该file文件的内容
//                fw.write(null);
//            }
            //这里要说明一下，write方法是写入缓存区，并没有写进file文件里面，要使用flush方法才写进去
            fw.flush();
            //关闭资源
            fw.close();
        } catch (IOException e) {
            // TODO
            e.printStackTrace();
        }
    }

    public static void getMemorySize() {


        Runtime r = Runtime.getRuntime();
        long startRAM = r.freeMemory();
        List<String> listRAM = new ArrayList<>();
        int loopTimes = 1000000;
        String string = "摘抄自出师表…………太长了，不粘在这里";
        for (int i = 0; i < loopTimes; i++) {
            listRAM.add(null);
            try {
                write("/Users/liunan/test/",null);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.toString());
            }
        }
        long endRAM = r.freeMemory();
        Field f = null;
        try {
            f = ArrayList.class.getDeclaredField("elementData");
            f.setAccessible(true);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        Object[] o = new Object[0];
        try {
            o = (Object[]) f.get(listRAM);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        //方案1 使用Runtime内存管理类

        String result = "测试RAM结束，测试占用内存空间约为 : " + (startRAM - endRAM);
        System.out.println(result);

        //方案2 反射的方式查询ArrayList的实际申请长度，然后按照每个字符串申请了2字节进行计算

        result = "测试RAM结束，测试占用内存空间约为 : " + ((long) o.length * (long) string.length() * 2);
        System.out.println(result);

        //方案3 反射的方式查询ArrayList的实际申请长度，然后取字符串的字节数组长度计算

        result = "测试RAM结束，测试占用内存空间约为 : " + ((long) o.length * (long) string.getBytes().length);
        System.out.println(result);
    }


    public static void write(String path,String value) throws Exception {
        try {
            //建立一个File对象
            File file = new File(path);
            //判断该文件的所属文件夹存不存在，不存在则创建文件夹
            if(!file.getParentFile().exists()){
                file.getParentFile().mkdirs();
            }
            //创建字符流（使用字节流比较麻烦）
            FileWriter fw = new FileWriter(file);
            //判断file是否存在
            if(!file.exists()){
                //如果不存在file文件，则创建
                file.createNewFile();
                fw.write(value);
            }else{
                //如果存在该file，可以根据情况来重写该file文件的内容
                fw.write(value);
            }
            //这里要说明一下，write方法是写入缓存区，并没有写进file文件里面，要使用flush方法才写进去
            fw.flush();
            //关闭资源
            fw.close();
        } catch (IOException e) {
            // TODO
            e.printStackTrace();
        }


    }


}