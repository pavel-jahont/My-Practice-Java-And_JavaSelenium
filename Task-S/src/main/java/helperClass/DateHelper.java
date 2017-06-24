package helperClass;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by User on 22.09.16.
 */
public class DateHelper {

        private static int my_value_day;

    public static void setMy_value_day(){
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd");
        my_value_day = Integer.parseInt(simpleDateFormat1.format(new Date()));
    }

    public static int getMy_value_day(){
        return my_value_day;
    }
}
