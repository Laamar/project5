package edu.guilford;

public class Dog  extends Animal{
    //attributes
    private String breed;

    //constructor with all the dog attributes
    public Dog(String name, int age, String color, String breed) {
        //call the super class constructor
        super(name, age, color);
        //set the breed to the breed passed in
        this.breed = breed;
    }

    //default constructor
    public Dog() {
        //call the super class constructor
        super();
        //create an array of dog breeds
        String[] breeds = {"Labrador Retriever", "German Shepherd", "Golden Retriever", "Bulldog", "Beagle", "French Bulldog", "Poodle", "Rottweiler", "Yorkshire Terrier", "German Shorthaired Pointer"};
        //set the breed to a random breed from the array
        this.breed = breeds[rand.nextInt(breeds.length)];
    }

    public Dog(String string, int i, int j) {
    }

    //getter and setter
    public String getBreed() {
        return breed;
    }

    //toString method
    @Override
    public String toString() {
        //return the name, age, color, and breed of the dog
        return "Dog [name=" + name + ", age=" + age + ", color=" + color + ", breed=" + breed + "]";
    }


}
