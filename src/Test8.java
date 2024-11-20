import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test8 {
    public static void main(String[] args) {
        var date = LocalDate.of(2021, 11, 4);
        var formatter = DateTimeFormatter.ofPattern("DD-MM-uuuu");
        System.out.println(formatter.format(date));
    }
}
