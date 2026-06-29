package s075.java;

public class S075Java {
    public static void main(String[] args) {
        System.out.println("--- Demonstrating Objects Independently ---");
        Vehicle genericVehicle = new Vehicle();
        genericVehicle.startEngine();

        System.out.println();
        Car myCar = new Car();
        myCar.startEngine();

        System.out.println("\n--- Demonstrating Runtime Polymorphism ---");
        Vehicle polymorphicVehicle = new Car();
        polymorphicVehicle.startEngine(); 
    }

    static class Vehicle {
        public void startEngine() {
            System.out.println("Vehicle engine starts with a standard ignition routine.");
        }
    }

    static class Car extends Vehicle {
        @Override
        public void startEngine() {
            System.out.println("Car engine starts quietly with a keyless push-start button.");
        }
    }
}
