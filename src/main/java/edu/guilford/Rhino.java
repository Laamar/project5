package edu.guilford;

public class Rhino extends Animal {
    //attributes
    private String breed;

    //constructor with all the rhino attributes
    public Rhino(String name, int age, String color, String breed) {
        //call the super class constructor
        super(name, age, color);
        //set the breed to the breed passed in
        this.breed = breed;
    }

    //default constructor
    public Rhino() {
        //call the super class constructor
        super();
        //create an array of rhino breeds
        String[] breeds = {"White", "Black", "Indian", "Javan", "Sumatran", "Greater One-Horned", "Black", "White", "Indian", "Javan"};
        //set the breed to a random breed from the array
        this.breed = breeds[rand.nextInt(breeds.length)];
    }

    public Rhino(String string, int i, int j) {
    }

    //getter and setter
    public String getBreed() {
        return breed;
    }

    //toString method
    @Override
    public String toString() {
        //return the name, age, color, and breed of the rhino
        return "Rhino [name=" + name + ", age=" + age + ", color=" + color + ", breed=" + breed + "]";
    }



    
}
