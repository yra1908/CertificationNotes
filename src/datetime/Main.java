package datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Created by ychikh on 23.06.2016.
 */
public class Main {

    public static void main(String[] args) {
        ZonedDateTime dateTime = ZonedDateTime.now();
        ZoneId id=dateTime.getZone();
        System.out.println(dateTime);
        System.out.println(id);
    }
}
