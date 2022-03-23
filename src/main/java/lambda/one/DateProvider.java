package lambda.one;

import java.util.Date;

public class DateProvider {
    public static DateFactory df = () -> new Date();

    public static Date getNow(){
        return df.create();
    }

    public static void setNow(Date d){
        df = () -> d;
    }

    public static void init(){
        df = () -> new Date();
    }
}
