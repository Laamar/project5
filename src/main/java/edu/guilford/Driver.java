package edu.guilford;

import java.util.Arrays;
import java.util.Scanner;

public class Driver 
{
    private static int numAnimals;

    public static void main( String[] args )
    {
        //instantiate a new scanner object
        Scanner scanner = new Scanner(System.in);
        //Create a new instance of the class Animal
        Animal animal = new Animal();

        //ASK the user what type of animal they want to create
        System.out.println("What type of animal do you want to create? (Dog or Cat)");
        System.out.println("Enter Dog or Cat or Rhino or Random");
        //get the user input
        String animalType = scanner.nextLine();

        //Create a new instance of the class Dog
        Dog dog = new Dog();
        //Create a new instance of the class Cat
        Cat cat = new Cat(animalType, numAnimals, animalType, animalType);
        //Create a new instance of the class Rhino
        Rhino rhino = new Rhino();


        ///Set the animal to the dog , cat, and rhino
        animal = dog;
        animal = cat;
        animal = new Rhino();

        //print out dog and cat toString methods
        System.out.println(dog.toString());
        System.out.println(cat.toString());
        System.out.println(rhino.toString());

        //if the animal type is dog
        if(animalType.equalsIgnoreCase("dog")){
            //create a new instance of the class Dog
            dog = new Dog();
            //print out the dog toString method
            System.out.println(dog.toString());
        }
        //if the animal type is cat
        else if(animalType.equalsIgnoreCase("cat")){
            //create a new instance of the class Cat
            cat = new Cat(animalType, numAnimals, numAnimals);
            //print out the cat toString method
            System.out.println(cat.toString());
        }
        //if the animal type is rhino
        else if(animalType.equalsIgnoreCase("rhino")){
            //create a new instance of the class Rhino
            rhino = new Rhino();
            //print out the rhino toString method
            System.out.println(rhino.toString());
        }
        //if the animal type is random
        else if(animalType.equalsIgnoreCase("random")){
            //create a new instance of the class Animal
            animal = new Animal();
            //set the animal to a random animal
            animal = animal.getRandomAnimal();
            //print out the animal toString method
            System.out.println(animal.toString());
        }
        //if the animal type is not dog, cat, rhino, or random
        else{
            //print out an error message
            System.out.println("Invalid animal type");
            //exit the program after 5 seconds
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.exit(0);

        }
        //empty line
        System.out.println();
        //let the userthat we are going to compare the animals
        System.out.println("Now we are going to compare the animals");
        //ask the user what animal they want to compare
        System.out.println("What animal do you want to compare? (Dog or Cat or Rhino)");
        //get the user input
        animalType = scanner.nextLine();
        //create a array with random animals with the size of the user input
        Animal[] animals = animal.getRandomAnimals(animalType, numAnimals);
        //print out the array of animals without toString method
        for (int i = 0; i < numAnimals; i++) {
            // create a new instance of the class Animal
            Animal randomAnimal = new Animal();
            // set the animal to the randomAnimal
            animals[i] = randomAnimal;
            // print out the randomAnimal
            System.out.println(randomAnimal);
    }
    //let the user know that we are going to sort the animals
    System.out.println("Now we are going to sort the animals");
    //sort the animals
    Arrays.sort(animals);
    //print out the animals
    //let the user know that we are going to print out the sorted animals
    System.out.println();
    System.out.println("Now we are going to print out the sorted animals");
    //loop through the animals
    for (int i = 0; i < numAnimals; i++) {
        //print out the animals
        System.out.println(animals[i]);
    }
    //let the user know that we are going to sort the cat by  name and age
    System.out.println();
    System.out.println("Now we are going to sort the cat by name and age");
    // ask the user how many cats they want to compare
    System.out.println("How many cats do you want to compare?");
    //get the user input
    int numCats = scanner.nextInt();
    //create a array of cats with the size of the user input
    Cat[] cats = new Cat[numCats];
    //print out the array of cats without toString method
    for (int i = 0; i < numCats; i++) {
        // create a new instance of the class Cat
        Cat randomCat = new Cat(animalType, i, i);
        // set the cat to the randomCat
        cats[i] = randomCat;
        // print out the randomCat
        System.out.println(randomCat);
    }
    //sort the cats by overriding the compareTo method
    Arrays.sort(cats);
    //print out the  sorted cats
    System.out.println();
    System.out.println("Now we are going to print out the sorted cats");
    //loop through the cats
    for (int i = 0; i < numCats; i++) {
        //print out the cats
        System.out.println(cats[i]);
    }
    //let the user know that we are going to sort the dog by  name and age
    System.out.println();
    System.out.println("Now we are going to sort the dog by name and age");
    // ask the user how many dogs they want to compare
    System.out.println("How many dogs do you want to compare?");
    //get the user input
    int numDogs = scanner.nextInt();
    //create a array of dogs with the size of the user input
    Dog[] dogs = new Dog[numDogs];
    //print out the array of dogs without toString method
    for (int i = 0; i < numDogs; i++) {
        // create a new instance of the class Dog
        Dog randomDog = new Dog();
        // set the dog to the randomDog
        dogs[i] = randomDog;
        // print out the randomDog
        System.out.println(randomDog);
    }
    //sort the dogs by overriding the compareTo method
    Arrays.sort(dogs);
    //print out the  sorted dogs
    System.out.println();
    System.out.println("Now we are going to print out the sorted dogs");
    //loop through the dogs
    for (int i = 0; i < numDogs; i++) {
        //print out the dogs
        System.out.println(dogs[i]);


}
    //let the user know that we are going to sort the rhino by  name and age
    System.out.println();
    System.out.println("Now we are going to sort the rhino by name and age");
    // ask the user how many rhinos they want to compare
    System.out.println("How many rhinos do you want to compare?");
    //get the user input
    int numRhinos = scanner.nextInt();
    //create a array of rhinos with the size of the user input
    Rhino[] rhinos = new Rhino[numRhinos];
    //print out the array of rhinos without toString method
    for (int i = 0; i < numRhinos; i++) {
        // create a new instance of the class Rhino
        Rhino randomRhino = new Rhino();
        // set the rhino to the randomRhino
        rhinos[i] = randomRhino;
        // print out the randomRhino
        System.out.println(randomRhino);
    }
    //sort the rhinos by overriding the compareTo method
    Arrays.sort(rhinos);
    //print out the  sorted rhinos
    System.out.println();
    System.out.println("Now we are going to print out the sorted rhinos");
    //loop through the rhinos
    for (int i = 0; i < numRhinos; i++) {
        //print out the rhinos
        System.out.println(rhinos[i]);
}

    //instantiate three objects of class cat with distinct parameters for name, age, and weight
    Cat cat1 = new Cat("Cat1", 1, 1);
    Cat cat2 = new Cat("Cat2", 2, 2);
    Cat cat3 = new Cat("Cat3", 3, 3);
    //lets the user see the instantiated objects
    System.out.println();
    System.out.println("Here are the instantiated cat objects");
    System.out.println(cat1);
    System.out.println(cat2);
    System.out.println(cat3);
    //sort the cats by overriding the compareTo method
    Arrays.sort(cats);
    //print out the  sorted cats
    System.out.println();
    System.out.println("Now we are going to print out the sorted cats");
    //loop through the cats
    for (int i = 0; i < numCats; i++) {
        //print out the cats
        System.out.println(cats[i]);
    }
    //instantiate three objects of class dog with distinct parameters for name, age, and weight
    Dog dog1 = new Dog("Dog1", 1, 1);
    Dog dog2 = new Dog("Dog2", 2, 2);
    Dog dog3 = new Dog("Dog3", 3, 3);
    //lets the user see the instantiated objects
    System.out.println();
    System.out.println("Here are the instantiated dog objects");
    System.out.println(dog1);
    System.out.println(dog2);
    System.out.println(dog3);
    //sort the dogs by overriding the compareTo method
    Arrays.sort(dogs);
    //print out the  sorted dogs
    System.out.println();
    System.out.println("Now we are going to print out the sorted dogs");
    //loop through the dogs
    for (int i = 0; i < numDogs; i++) {
        //print out the dogs
        System.out.println(dogs[i]);
    }

    //instantiate three objects of class rhino with distinct parameters for name, age, and weight
    Rhino rhino1 = new Rhino("Rhino1", 1, 1);
    Rhino rhino2 = new Rhino("Rhino2", 2, 2);
    Rhino rhino3 = new Rhino("Rhino3", 3, 3);
    //lets the user see the instantiated objects
    System.out.println();
    System.out.println("Here are the instantiated rhino objects");
    System.out.println(rhino1);
    System.out.println(rhino2);
    System.out.println(rhino3);
    //sort the rhinos by overriding the compareTo method
    Arrays.sort(rhinos);
    //print out the  sorted rhinos
    System.out.println();
    System.out.println("Now we are going to print out the sorted rhinos");
    //loop through the rhinos
    for (int i = 0; i < numRhinos; i++) {
        //print out the rhinos
        System.out.println(rhinos[i]);
    
}


}

}