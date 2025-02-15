package java17Exam;

import locale_dates.FormatDateTime;

import java.time.LocalDate;
import java.time.Period;

public class Example11 {
    public static void main(String[] args) {
        var x = LocalDate.of(2024, 4, 1)
                .plusMonths(1)
                .withDayOfMonth(15)
                .plusDays(-4)
                .minus(Period.ofWeeks(1));
        System.out.println(x);

        var y = Period.between(
                LocalDate.of(2024, 4, 1),
                LocalDate.of(2024, 5, 1).plusDays(4));
        System.out.println(y);

        var z = LocalDate.of(2024, 4, 1);
        z.withDayOfMonth(4).plus(Period.ofDays(30));
        System.out.println(z); // LocalDate is immutable,Thus, x remains 2024-04-01

    }
}
