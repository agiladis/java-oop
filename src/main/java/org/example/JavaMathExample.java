package org.example;

public class JavaMathExample {
    public static void main(String[] args) {
        double x = 28;
        double y = 4;

        // return maximum of two numbers
        System.out.println("Maximum number of x and y is: " + Math.max(x, y));

        // return square root of y
        System.out.println("Square root of y is: " + Math.sqrt(y));

        // return power of x and y
        System.out.println("Power of x and y is: " + Math.pow(x, y));

        // return the logarithm of given value
        System.out.println("log10  of x is: " + Math.log10(x));

        // return a power of 2
        System.out.println("exp of a is: " + Math.exp(x));

        // return (a power of 2)-1
        System.out.println("expm1 of a is: " + Math.expm1(x));
    }
}
