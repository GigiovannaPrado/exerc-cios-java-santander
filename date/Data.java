package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.Date;

public class Data {
    static void main(String[] args) {
        var date = new Date();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
        System.out.println("--> "+date);
        System.out.println("--> "+ formatter.format(date));

        System.out.println("=======================================================");

        var calendar = Calendar.getInstance();
        DateFormat formatterCalendar = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
        System.out.println("--> "+ calendar.get(Calendar.DATE));
        System.out.println("--> "+ calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("--> "+ calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("--> "+ calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("--> "+ calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("--> "+ calendar.get(Calendar.AM));
        System.out.println("--> "+ calendar.get(Calendar.AM_PM));
        System.out.println("--> "+ calendar.get(Calendar.MILLISECOND));
        System.out.println("--> "+ calendar.get(Calendar.SECOND));
        System.out.println("--> "+ calendar.get(Calendar.HOUR));
        System.out.println("--> "+ calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("--> "+ calendar.get(Calendar.ZONE_OFFSET));
        System.out.println("--> "+ formatter.format(calendar.getTime()));

        System.out.println("=======================================================");

        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter formatterLocalDate = DateTimeFormatter.ofPattern("dd/MM/yyyy - hh:mm:ss");
        System.out.println(localDate.format(formatterLocalDate));
    }
}
