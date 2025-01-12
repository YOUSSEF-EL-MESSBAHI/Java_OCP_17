public class TextBlockExample {
    public static void main(String[] args) {
        // Using a literal string
        String text1 = "Geeks For Geeks";
        // Using a text block
        String text2 = """ 
                Geeks For Geeks""";
        String text3 = text2.concat(text1);
        System.out.println(text3);
        // Both text1 and text2 are strings of equal value
        System.out.println(text1.equals(text2));    // true
        // Both text1 and text2 intern to the same string
        System.out.println(text1 == text2);         // true


        String season = """
                winter""";    // the six characters w i n t e r

        String period = """
                winter
                """;          // the seven characters w i n t e r LF

        String greeting =
                """
                Hi, "Bob"
                """;        // the ten characters H i , SP " B o b " LF

        String salutation =
                """
                Hi,
                 "Bob"
                """;        // the eleven characters H i , LF SP " B o b " LF

        String empty = """
               """;      // the empty string (zero length)

        String quote = """
               " 
               """;      // the two characters " LF
        System.out.println(quote);

        String backslash = """
                   \\
                   """;  // the two characters \ LF
        System.out.println(backslash);
    }
}
