package inheretence;

class Vehicle {
    protected void drive(long distance) {
        System.out.print("Vehicle");
    }

    void drive(int distance) {
        System.out.print("Car");
    }
}

public class Bike extends Vehicle {
    protected void drive(int distance) {
        System.out.print("Bike");
    }

    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.drive((byte) 10);
        v.drive(10);
        v.drive(10L);
    }
}
