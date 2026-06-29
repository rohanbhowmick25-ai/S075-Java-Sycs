package s075.java;

public class S075Java {
    public static void main(String[] args) {
        System.out.println("--- Demonstrating Static Method ---");
        Calculator.printWelcomeMessage();

        System.out.println("\n--- Demonstrating Constructor Overloading ---");
        Calculator calc1 = new Calculator(); 
        Calculator calc2 = new Calculator("Advanced Matrix Mode"); 

        System.out.println("\n--- Demonstrating Method Overloading ---");
        System.out.println("Sum of 2 integers (10 + 20): " + calc2.add(10, 20));
        System.out.println("Sum of 3 integers (10 + 20 + 30): " + calc2.add(10, 20, 30));
        System.out.println("Sum of 2 decimals (10.5 + 20.5): " + calc2.add(10.5, 20.5));
    }
}

class Calculator {
    private String calculatorMode;

    public Calculator() {
        this.calculatorMode = "Standard Mode";
        System.out.println("Constructor 1 called. Mode set to: " + calculatorMode);
    }

    public Calculator(String mode) {
        this.calculatorMode = mode;
        System.out.println("Constructor 2 called. Mode set to: " + calculatorMode);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void printWelcomeMessage() {
        System.out.println("Welcome to the Universal Calculator Utility System.");
    }
}
