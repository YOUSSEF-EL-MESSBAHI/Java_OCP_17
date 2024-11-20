import java.text.NumberFormat;

public class Test6 {
    public static void main(String[] args) {
        double value1 = -3.5;
        double value2 = -4.5;

        // Get the integer instance of NumberFormat
        NumberFormat integerFormat = NumberFormat.getIntegerInstance();

        // Format the values
        String formattedValue1 = integerFormat.format(value1);
        String formattedValue2 = integerFormat.format(value2);

        System.out.println("Rounded -3.5: " + formattedValue1);  // Output: "-4"
        System.out.println("Rounded -4.5: " + formattedValue2);  // Output: "-5"

        System.out.format("A%nB%nC");
    }
}
