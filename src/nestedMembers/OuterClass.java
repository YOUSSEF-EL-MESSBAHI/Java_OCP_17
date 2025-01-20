package nestedMembers;

public class OuterClass {

    // Static fields and methods in the outer class
    private static int staticValue = 42;
    private static String staticMessage = "Hello from OuterClass!";

    // Instance fields in the outer class
    private int instanceValue = 100;

    // Static Nested Class
    public static class NestedStaticClass {

        // Static members inside the static nested class
        public static String nestedStaticField = "Static field in NestedStaticClass";

        // Instance members inside the static nested class
        private String nestedInstanceField;

        // Constructor
        public NestedStaticClass(String nestedInstanceField) {
            this.nestedInstanceField = nestedInstanceField;
        }

        // Static method in the static nested class
        public static void displayStaticInfo() {
            System.out.println("Static Value from OuterClass: " + staticValue);
            System.out.println("Static Message from OuterClass: " + staticMessage);
            // Cannot access non-static members of OuterClass
            // System.out.println(instanceValue); // Compilation Error
        }

        // Instance method in the static nested class
        public void displayInstanceInfo() {
            System.out.println("Instance Field in NestedStaticClass: " + nestedInstanceField);
            // Static members from the outer class can still be accessed
            System.out.println("Static Value from OuterClass: " + staticValue);
        }
    }

    // Method in OuterClass to demonstrate creation of the static nested class
    public void demonstrateStaticNestedClass() {
        // Creating an instance of the static nested class
        NestedStaticClass nested = new NestedStaticClass("Instance field in nested");
        NestedStaticClass.displayStaticInfo(); // Calling static method
        nested.displayInstanceInfo(); // Calling instance method
    }

    public static void main(String[] args) {
        // Accessing static nested class without creating an instance of OuterClass
        OuterClass.NestedStaticClass.displayStaticInfo();

        // Creating an instance of the static nested class
        OuterClass.NestedStaticClass nestedInstance = new OuterClass.NestedStaticClass("Demo instance field");
        nestedInstance.displayInstanceInfo();

        // Accessing static field of the static nested class
        System.out.println("Nested static field: " + NestedStaticClass.nestedStaticField);
    }
}

