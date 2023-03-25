package io.javabrains.javabasics;

/*
Create a class `Animal2` with an abstract method `makeSound`.
Create an anonymous inner class implementation of `Animal2` and then call the `makeSound` method
 */

public class AnonymousInnerClasses {
    public static void main(String[] args) {

    Animal2 animal = new Animal2() {
        @Override
        void makeSound() {
            System.out.println("Call from anonymous inner class");
        }
    };
    animal.makeSound();

    }
}


abstract class Animal2 {

    abstract void makeSound();
}