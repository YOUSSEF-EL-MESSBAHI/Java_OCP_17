package java17Exam;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Example10 {
    public static void main(String[] args) {
        ZoneId zoneId= ZoneId.of("America/Chicago");
        ZonedDateTime zonedDateTime=ZonedDateTime.of(
                LocalDate.of(2021,11,7),
                LocalTime.of(1,30),
                zoneId
        );
        ZonedDateTime anHourLater = zonedDateTime.plusHours(1);
        System.out.println(zonedDateTime);
        System.out.println(anHourLater);
        System.out.println(zonedDateTime.getHour() == anHourLater.getHour());
        System.out.println(zonedDateTime.getOffset().equals(anHourLater.getOffset()));
        System.out.println(zonedDateTime.getOffset());
    }
}
