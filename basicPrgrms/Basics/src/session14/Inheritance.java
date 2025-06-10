package session14;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }
}

class AdvancedCalculator extends Calculator {
    int multiply(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return (double) a / b;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator();

        int a = 20;
        int b = 5;

        System.out.println("Add: " + calc.add(a, b));         // 25
        System.out.println("Subtract: " + calc.subtract(a, b)); // 15
        System.out.println("Multiply: " + calc.multiply(a, b)); // 100
        System.out.println("Divide: " + calc.divide(a, b));     // 4.0
    }
}

