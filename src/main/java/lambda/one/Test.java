package lambda.one;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {

        Date now = DateProvider.getNow();
        System.out.println(now);


        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date  = format.parse("2009-12-31");

        DateProvider.setNow(date);

        now = DateProvider.getNow();
        System.out.println(now);

        DateProvider.init();


        now = DateProvider.getNow();
        System.out.println(now);
    }
}
