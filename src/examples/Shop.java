package examples;

public class Shop {
    static {
        System.out.println("Shop Static");
    }
    {
        System.out.println("Shop Instance");
    }
    public static void main(String[] args) {
        Product p1=new Food();
        Product p2=new Food();

//        Shop Static
//        Product Static
//        Food Static
//        Product Instance
//        Product Constructor
//        Food Instance
//        Food Constructor
//        Product Instance
//        Product Constructor
//        Food Instance
//        Food Constructor

    }
}

