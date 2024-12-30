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
//Following are the ways to use the 'this' keyword in java:
//1. Using 'this' keyword to refer to current class instance variables
//2. Using this() to invoke the current class constructor
//3. Using 'this' keyword to return the current class instance
//4. Using 'this' keyword as a method parameter
//5. Using 'this' keyword to invoke the current class method
//6. Using 'this' keyword as an argument in the constructor call

