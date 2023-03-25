package io.javabrains.javabasics;

/*

1.  Create an `Animal` class with member variables for the name and age of the animal and a constructor method that initializes the member variables.
2.  Create a `Dog` class that extends the `Animal` class and has a member variable for the breed of the dog and a constructor method that initializes the member variables.
3.  Override the `makeSound` method in the `Dog` class to print "The dog barks".
4.  Create a `Cat` class that extends the `Animal` class and has a member variable for the number of lives of the cat and a constructor method that initializes the member variables.
5.  Override the `makeSound` method in the `Cat` class to print "The cat meows".
6.  In the `main` method of this class, create an array of `Animal` objects and initialize it with a `Lion`, a `Dog`, a `Cat`, and another `Animal` of your choice.
7.  Loop through the array of `Animal` objects and print the name, age, and sound of each animal.
 */


import java.util.ArrayList;

public class InheritanceChallenge {

    private static void printAnimal(Animal animal){
        System.out.println(animal.getName() + " " + animal.getAge() + " " + animal.makeSound());
    }


    public static void main(String[] args) {

        Animal macka = new Cat("Baki", 12, 3);
        Animal pas = new Dog("Bogi", 9, "Vucjak");
        Animal lion = new Animal("Lion", 12);
        Animal alienAnimal = new Animal("Alien animal", 3);

        Animal[] animals =  {macka,pas,lion,alienAnimal};

        for (Animal animal : animals) {
            printAnimal(animal);
        }


        };
}





class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String makeSound() {
        return " I am not concrete.";
    }
}

class Dog extends Animal {

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "The dog barks";
    }
}

class Cat extends Animal {

    private int noOfLives;


    public Cat(String name, int age, int noOfLives) {
        super(name, age);
        this.noOfLives = noOfLives;
    }
}