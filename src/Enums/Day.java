package Enums;

public enum Day /*implements MyInterface*/{
//        int i =0;
    SUNDAY("High"){ public void printTemperature(){ System.out.println(75); }},
    MONDAY ("Moderate"){ @Override public void printTemperature() {System.out.println(65);}},
    TUESDAY ("High"){ @Override public void printTemperature() {System.out.println(75);}},
    WEDNESDAY("High") { @Override public void printTemperature() {System.out.println(85);}},
    THURSDAY ("Moderate"){ @Override public void printTemperature() {System.out.println(65);}},
    FRIDAY ("High"){ @Override public void printTemperature() {System.out.println(75);}},
    SATURDAY ("High"){ @Override public void printTemperature() {System.out.println(85);}};

    private String temperature;
    String tempt;

    /*private*/ Day (String temperature){
        this.temperature = temperature;
    }

    public  abstract void printTemperature();/*{
        System.out.println(65);
    }*/

}
interface MyInterface{

}
