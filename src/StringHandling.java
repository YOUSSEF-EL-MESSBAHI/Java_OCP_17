public class StringHandling {

    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = "Hello World";
        System.out.println(str == str2);
        System.out.println(str.equals(str2));

        str.concat("test");
        StringBuilder stringBuilder = new StringBuilder("Hello World");
        stringBuilder.append("test");
        System.out.println(str);
        System.out.println(str.equals(stringBuilder.toString()));
        System.out.println(stringBuilder.toString() +"|"+str);

    }
}
