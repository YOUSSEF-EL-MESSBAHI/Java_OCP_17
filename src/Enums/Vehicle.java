package Enums;

import java.util.List;

public enum Vehicle {
    CAR(List.of(4)),
    TRUCK(List.of(6, 8)),
    MOTORCYCLE(null) {
        public int wheelCount() {
            return wheels.get(0) + 2;
        }
    };

    List<Integer> wheels;

    Vehicle(List<Integer> wheels) {
        this.wheels = wheels;
    }

    public int wheelCount() {
        return wheels.get(0);
    }

    public static void main(String[] args) {
//        Vehicle.MOTORCYCLE.wheels = List.of(-2);
        System.out.println(Vehicle.MOTORCYCLE.wheelCount());
    }
}
