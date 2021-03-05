package 时间转换;

import java.text.SimpleDateFormat;
import java.util.Date;

public class demo {

    public static void main(String[] args) {
       System.out.println(refFormatNowDate()); ;
    }

    public static String refFormatNowDate() {
        Date nowTime = new Date(System.currentTimeMillis());
        SimpleDateFormat sdFormatter = new SimpleDateFormat("MM月d日");
        String retStrFormatNowDate = sdFormatter.format(nowTime);

        return retStrFormatNowDate;
    }
}
