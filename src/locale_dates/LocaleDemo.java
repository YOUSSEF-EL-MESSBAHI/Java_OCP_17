package locale_dates;

import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {
        Locale locale = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .setVariant("POSIX")
                .build();
        Locale locale1 = new Locale.Builder()
                .setLanguage("de")
                .setRegion("DE")
                .build();
        Locale locale2=Locale.GERMAN;
        Locale locale3=Locale.GERMANY;
        System.out.println(locale2);
        System.out.println(locale1);
        System.out.println(locale3);
        System.out.println(locale2==locale1);
    }
}
