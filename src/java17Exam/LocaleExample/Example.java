package java17Exam.LocaleExample;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Example {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "GB")); // Default locale set to English (UK)
        ResourceBundle rb = ResourceBundle.getBundle("msg", new Locale("fr")); // Load French resource
        NumberFormat nf = NumberFormat.getCurrencyInstance(); // Create currency format based on default locale (en_GB)
        String result = MessageFormat.format(rb.getString("product"), "Tea", nf.format(1.99));
        System.out.println(result);
    }
}
