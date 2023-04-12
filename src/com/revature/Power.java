package com.revature;

// Functional interface, an interface with one single abstract method
@FunctionalInterface
interface Power {
    // One single abstract method:
    int calculate(int x);

    // Because of @FunctionalInterface, we can't have more than one abstract method:
    // double calculate(double x);
}
