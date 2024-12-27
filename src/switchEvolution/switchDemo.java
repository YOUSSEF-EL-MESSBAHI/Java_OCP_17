package switchEvolution;

public class switchDemo {

    public static void main(String[] args) {

    }
    public void switchCasejava7(){
        int value = 5;
        switch(value)
        {
            case 1:
                System.out.println("One");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("Unknown");
        }
    }
    public void switchCasejava8(){
        String day = "Tuesday";
        switch (day) {
            case "Monday":
                System.out.println("Week day");
                break;
            case "Tuesday":
                System.out.println("Week day");
                break;
            case "Wednesday":
                System.out.println("Week day");
                break;
            case "Thursday":
                System.out.println("Week day");
                break;
            case "Friday":
                System.out.println("Week day");
                break;
            case "Saturday":
                System.out.println("Weekend");
                break;
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Unknown");
        }
    }

    public void switchCasejava8Enums(){
        DAYS days = DAYS.SUNDAY;
        switch (days) {
            case MONDAY:
                System.out.println("Weekdays");
                break;
            case TUESDAY:
                System.out.println("Weekdays");
                break;
            case WEDNESDAY:
                System.out.println("Weekdays");
                break;
            case THURSDAY:
                System.out.println("Weekdays");
                break;
            case FRIDAY:
                System.out.println("Weekdays");
                break;
            case SATURDAY:
                System.out.println("Weekends");
                break;
            case SUNDAY:
                System.out.println("Weekends");
                break;
            default:
                System.out.println("Unknown");
        }
    }

    public String switchCasejava13(String day){
        return  switch (day) {
            case "Monday":
                yield  "Weekday";
            case "Tuesday":
                yield "Weekday";
            case "Wednesday":
                yield "Weekday";
            case "Thursday":
                yield "Weekday";
            case "Friday":
                yield "Weekday";
            case "Saturday":
                yield "Weekend";
            case "Sunday":
                yield "Weekend";
            default:
                yield "Unknown";
        };
    }

    public String switchCasejava13Arrow(String day){
        return  switch (day) {
            case "Monday"-> "Week day";
            case "Tuesday"-> "Week day";
            case "Wednesday"->"Week day";
            case "Thursday"->"Week day";
            case "Friday"->"Week day";
            case "Saturday"-> "Weekend";
            case "Sunday"-> "Weekend";
            default->"Unknown";
        };
    }

    public String switchCasejava13Multi(String day){
        return  switch (day) {
            case "Monday","Tuesday","Wednesday","Thursday","Friday"
                    -> "Week day";
            case "Saturday", "Sunday" -> "Weekend";
            default->"Unknown";
        };
    }

//    public String switchCasejava14(Object obj){
//        return switch (obj) {
//            case Integer i -> "It is an integer";
//            case String s -> "It is a string";
//            case Employee s -> "It is a Employee";
//            default -> "It is none of the known data types";
//        };
//    }

//    public String switchCasejava15(Object obj){
//        return switch (obj) {
//            case Integer i -> "It is an integer";
//            case String s -> "It is a string";
//            case Employee employee && employee.getDept().equals("IT") -> "IT Employee";
//                default -> "It is none of the known data types";
//        };
//    }

//    case null -> "It is a null object";

}
enum DAYS {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}