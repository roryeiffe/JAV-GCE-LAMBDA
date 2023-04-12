package com.revature;

@FunctionalInterface
interface Greeter {
    // One abstract method, takes in a string doesn't return anything:
    void greet(String x);
}