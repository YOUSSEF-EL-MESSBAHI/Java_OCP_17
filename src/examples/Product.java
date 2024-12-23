package examples;

public class Product {
    static {
        System.out.println("Product Static");
    }
    {
        System.out.println("Product Instance");
    }
    Product(){
        System.out.println("Product Constructor");
    }
}
