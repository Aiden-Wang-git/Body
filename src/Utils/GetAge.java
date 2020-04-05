package Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @program: Body
 * @description: 通过生日获取年龄
 * @author: Wang Jun
 * @create: 2020-04-05 12:57
 */
public class GetAge {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM--dd");
    public static int getAge(String birth){
        try {
            Calendar today = Calendar.getInstance();
            Calendar birthday = Calendar.getInstance();
            birthday.setTime(sdf.parse(birth));
            if (birthday.after(today))
                return -1;
            else {
                int age = today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
                if (today.get(Calendar.DAY_OF_YEAR) > birthday.get(Calendar.DAY_OF_YEAR))
                    ++age;
                return age;
            }
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("年龄计算错误！");
            return -1;
        }
    }
}
