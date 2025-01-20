package nestedMembers;

public class Outer {

    // Instance fields in the outer class
    private String instanceField = "Outer Instance Field";
    private int outerNumber = 42;

    // Static fields in the outer class
    private static String staticField = "Outer Static Field";

    // Inner (non-static nested) class
    public class InnerClass {

        // Instance field in the inner class
        private String innerField;

        // Constructor for the inner class
        public InnerClass(String innerField) {
            this.innerField = innerField;
        }

        // Instance method in the inner class
        public void displayInfo() {
            System.out.println("Inner Field: " + innerField);

            // Accessing outer class instance fields
            System.out.println("Outer Instance Field: " + instanceField);
            System.out.println("Outer Number: " + outerNumber);

            // Accessing outer class static fields
            System.out.println("Outer Static Field: " + staticField);
        }
    }

    // Method in the outer class to demonstrate inner class usage
    public void demonstrateInnerClass() {
        InnerClass inner = new InnerClass("Inner Instance Field");
        inner.displayInfo();
    }

    public static void main(String[] args) {
        // Cannot create an instance of InnerClass directly without an instance of Outer
        // Outer.InnerClass inner = new Outer.InnerClass(); // Compilation Error

        // Creating an instance of the outer class
        Outer outer = new Outer();

        // Creating an instance of the inner class through the outer class instance
        Outer.InnerClass inner = outer.new InnerClass("Inner Instance Field from Main");
        inner.displayInfo();

        // Using a method in the outer class to demonstrate inner class
        outer.demonstrateInnerClass();
    }
}

