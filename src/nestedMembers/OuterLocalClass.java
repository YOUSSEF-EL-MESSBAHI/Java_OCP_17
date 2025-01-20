package nestedMembers;

public class OuterLocalClass {

    private String outerField = "Outer Field";

    public void demonstrateLocalClass() {
        int localVariable = 42; // Must be effectively final to be accessed

        // Local class defined inside a method
        class LocalClass {
            private String localField;

            public LocalClass(String localField) {
                this.localField = localField;
            }

            public void displayInfo() {
                System.out.println("Local Field: " + localField);

                // Accessing outer class members
                System.out.println("Outer Field: " + outerField);

                // Accessing effectively final local variable
                System.out.println("Local Variable: " + localVariable);
            }
        }

        // Instantiating the local class
        LocalClass local = new LocalClass("Local Field Value");
        local.displayInfo();
    }

    public static void main(String[] args) {
        OuterLocalClass outer = new OuterLocalClass();
        outer.demonstrateLocalClass();
    }
}

