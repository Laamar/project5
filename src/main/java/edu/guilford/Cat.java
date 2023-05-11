package edu.guilford;

public class Cat extends Animal{
    //attributes
    private String breed;

    //constructor with all the cat attributes
    public Cat(String name, int age, String color, String breed) {
        //call the super class constructor
        super(name, age, color);
        //set the breed to the breed passed in
        this.breed = breed;
    }

    //default constructor
    public Cat(String string, int i, int j) {
        //call the super class constructor
        super();
        //create an array of cat breeds
        String[] breeds = {"Abyssinian", "American Bobtail", "American Curl", "American Shorthair", "American Wirehair", "Balinese", "Bengal", "Birman", "Bombay", "British Shorthair"};
        //set the breed to a random breed from the array
        this.breed = breeds[rand.nextInt(breeds.length)];
    }

    //getter and setter
    public String getBreed() {
        return breed;
    }

    //toString method
    @Override
    public String toString() {
        //return the name, age, color, and breed of the cat
        return "Cat [name=" + name + ", age=" + age + ", color=" + color + ", breed=" + breed + "]";
    }

}
