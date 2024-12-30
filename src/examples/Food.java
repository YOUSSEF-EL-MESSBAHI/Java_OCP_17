package examples;

public class Food extends Product{
    static {
        System.out.println("Food Static");
    }
    {
        System.out.println("Food Instance");
    }
    Food(){
        System.out.println("Food Constructor");
    }


}
