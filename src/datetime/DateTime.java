package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTime {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2018, Month.APRIL,30);
        date.plusDays(2);
        date.plusYears(3);
        System.out.println(date);  //2018-04-30 Dates ae immutable. Result is unchanged

        LocalDateTime dateTime = LocalDateTime.of(2015,5,10,11,22,11);
        Period p = Period.of(1, 2, 3);
        dateTime=dateTime.minus(p);

        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(dateTime.format(f));     //11:22 FORMATTER ONLY FOR TIME

    }
}
