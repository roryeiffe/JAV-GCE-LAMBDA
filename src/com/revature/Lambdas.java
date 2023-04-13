package com.revature;

public class Lambdas {

    public static void main(String[] args) {

        // We instantiate an FI using lambda expressions
        // Note how the parameter/return types must match the FI:
        Power square = (int x) -> x * x;
        // If our method implementation spans multiple lines, we need curly braces:
        Power cube = (int x) -> {
            int result = x * x * x;
            return result;
        };
        // Make sure that the lambda expressions adhere to the method in the functional interface:
        // Power print = (int x) -> "Hello";

        // Invoking the lambda expressions:
        int x = square.calculate(5);
        int y = cube.calculate((6));

        System.out.println(x);
        System.out.println(y);

        // Passing these lambda expressions as arguments to a method
        applyFuncAndPrint(square, 7);
        applyFuncAndPrint(cube, 8);


        // Use lambda expressions to give different implementations
        // of the Greet interface:
        Greeter englishGreeter = (String name) -> System.out.println("Hello, " + name);

        Greeter frenchGreeter = (String name) -> System.out.println("Bonjour, " + name);

        Greeter pirateGreeter = (String name) -> System.out.println("Ahoy, " + name + "!");

        // Call the greet method in the greeters that we created:
        englishGreeter.greet("Max");
        frenchGreeter.greet("Paul");
        pirateGreeter.greet("Blackbeard");
    }

    // Take in an instance of the FI and an integer as a parameters
    // and pass in the integer to the FI instance:
    public static void applyFuncAndPrint(Power r, int x) {
        int result = r.calculate(x);
        System.out.println("The result is : " + result);
    }

}
