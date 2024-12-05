import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.KOREAN);
        System.out.println(Locale.getDefault());
        Locale.setDefault(new Locale("en", "AU"));
        System.out.println(Locale.getDefault());
        Locale.setDefault(new Locale("EN"));
        System.out.println(Locale.getDefault());
    }
}
