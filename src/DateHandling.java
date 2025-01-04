import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateHandling {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2017, 3, 12);
        LocalTime localTime = LocalTime.of(1, 0);
        ZoneId zone = ZoneId.of("America/New_York");
        ZonedDateTime z = ZonedDateTime.of(localDate, localTime, zone);
        Duration duration = Duration.ofHours(3);
        Period period= Period.ofYears(1).ofDays(1).ofMonths(1).ofWeeks(2);
        System.out.println(period.getDays());
        ZonedDateTime later = z.plus(duration);
        System.out.println(later.getHour());
        //Daylight Saving Time Basics: In the United States, DST begins on the second Sunday of March. At 2:00 AM, clocks are set forward by one hour to 3:00 AM.
        // just for ZoneId.of("America/New_York")
        //***********************************************************************************************
//        int month = Month.MARCH; not compile | correct code : Month month = Month.MARCH;


        LocalDate hatDay = LocalDate.of(2017, Month.JANUARY, 15);
        DateTimeFormatter f = DateTimeFormatter.ISO_DATE;
        System.out.println(f.format(hatDay));
//        f.formatDate(hatDay);
        System.out.println(hatDay.format(f));


        LocalDate localDate1 = LocalDate.of(2017, Month.NOVEMBER, 5);
        LocalTime localTime1 = LocalTime.of(0, 0);
        ZoneId zone1 = ZoneId.of("America/New_York");
        ZonedDateTime z1 = ZonedDateTime.of(localDate1, localTime1, zone1);
        for (int i = 0; i < 6; i++) {
            ZonedDateTime plusHours = z1.plusHours(1);// we shoud assign it to a new ZonedDateTime
            System.out.println(plusHours);
        }
//        System.out.println(plusHours);

        /*
        HH: Represents the hour of the day in a 24-hour format (00 to 23).
        mm: Represents the minute of the hour (00 to 59).
        MM represents months
        hh is for 12-hour clock format (01 to 12)
        Instant instant = zdt.toInstant(); This converts the ZonedDateTime to an Instant (which is in UTC).
        withzonesameinstant to get date same date in another zone id

         */

        LocalDate date = LocalDate.parse("2024-12-31");
        date = date.plus(Period.ofMonths(1).plusDays(1));
        System.out.println(date);



    }
}
