package java17Exam.sealedClasses;

import java.time.Duration;
import java.time.Period;

public class Example6 {
    public static void main(String[] args) {
        Duration duration1 = Duration.ofMillis(5000);
        System.out.println(duration1);
        Duration duration = Duration.ofSeconds(60);
        System.out.println(duration);
        Period period = Period.ofDays(6);
        System.out.println(period);
    }
}
