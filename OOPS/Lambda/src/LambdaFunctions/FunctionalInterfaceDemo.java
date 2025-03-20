package LambdaFunctions;

import java.util.function.*;

class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        // 1. Consumer Example - Takes input but does not return anything
        Consumer<String> printMessage = message -> System.out.println("Hello, " + message);
        printMessage.accept("Soumya");

        // 2. Supplier Example - Supplies data without any input
        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println("Random Number: " + randomNumber.get());

        // 3. Function Example - Takes input and returns output
        Function<Integer, String> numberToString = num -> "Number: " + num;
        System.out.println(numberToString.apply(10));

        // 4. Predicate Example - Tests a condition and returns boolean
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 5 even? " + isEven.test(5));

        // Custom Functional Interface
        MathOperation addition = (a, b) -> a + b;
        MathOperation multiplication = (a, b) -> a * b;

        System.out.println("Addition: " + addition.operate(10, 5));
        System.out.println("Multiplication: " + multiplication.operate(10, 5));
    }
}

// Custom Functional Interface
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}
