package io.javabrains.javabasics;

public class JavaVariables {

    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types
        // int variable to store an integer value
        int a = new Integer(10);
        // long variable to store a long value
        long b = 20L;
        // float variable to store a floating-point value
        float c = 30F;

        // double variable to store a double value
        double d = 40;

        // char variable to store a single character
//        char e = 50;
        char e = 'e';

        // boolean variable to store a boolean value
        boolean f = true;

        // String variable to store a string of characters
        String g = new String(new char[]{'a','b','c'});

        // Step 2: Print the values of the variables to the console
        System.out.println(a + " " +b + " " + c + " " + d + " " + e + " " + f + " " + g);

        // Step 3: Modify the values of the variables and print the updated values
        a = 20;
        g = "Milos";
        System.out.println(a + " " + g );
    }
}
