package edu.guilford;

import java.util.Random;

public class Animal implements Comparable<Animal> {
    //attributes
    protected String name;
    protected int age;
    protected String color;

    Random rand = new Random();
    //constructor with all the ainmals attributes
    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    //default constructor
    public Animal() {
        //create a array of strings with the names

 String[] names = {"Buddy", "Max", "Charlie", "Jack", "Cooper", "Rocky", "Toby", "Tucker", "Jake", "Bear", "Duke",
                "Teddy", "Oliver", "Riley", "Bailey", "Bentley", "Milo", "Buster", "Cody", "Dexter", "Winston", "Murphy",
                "Leo", "Lucky", "Oscar", "Louie", "Zeus", "Henry", "Sam", "Harley", "Baxter", "Gus", "Sammy", "Jackson",
                "Bruno", "Diesel", "Jax", "Gizmo", "Bandit", "Rusty", "Marley", "Jasper", "Brody", "Roscoe", "Hank",
                "Otis", "Bo", "Joey", "Beau", "Ollie", "Tank", "Shadow", "Peanut", "Hunter", "Scout", "Blue", "Rocco",
                "Simba", "Tyson", "Ziggy", "Boomer", "Romeo", "Apollo", "Ace", "Luke", "Rex", "Finn", "Chance", "Rudy",
                "Loki", "Moose", "George", "Samson", "Coco", "Benny", "Thor", "Rufus", "Prince", "Chester", "Brutus",
                "Scooter", "Chico", "Spike", "Gunner", "Sparky", "Mickey", "Kobe", "Chase", "Oreo", "Frankie", "Mac",
                "Benji", "Bubba", "Champ", "Brady", "Elvis", "Copper", "Cash", "Archie", "Walter", "Dakota", "Henry",
                "Beethoven", "Clifford", "Elliot", "Groot", "Ozzy", "Marley", "Buster", "Buddy", "Duke", "Harley",
                "Jax", "Leo", "Loki", "Louie", "Milo", "Oliver", "Ollie", "Oreo", "Oscar", "Otis", "Prince", "Rex" };
        //create a array of strings with the colors
        String[] colors = {"White", "Black", "Brown", "Golden", "Yellow", "Gray", "Cream", "Tan", "Red", "Chocolate",
                "Fawn", "Silver", "Blonde", "Blue", "Ginger", "Rust", "Liver", "Sable", "Apricot", "Beige", "Brindle",
                "Mahogany", "Sandy", "Silver", "Charcoal", "Cinnamon", "Buff", "Orange", "Peach", "Agouti", "Amber",
                "Auburn", "Biscuit", "Blue", "Buff", "Caramel", "Chestnut", "Copper", "Ebony", "Hazel", "Lilac",
                "Mottled", "Olive", "Pink", "Rose", "Ruddy", "Russet", "Rusty", "Sorrel", "Tawny", "Teal", "Titian",
                "Wheaten", "Crimson", "Fallow", "Indigo", "Mauve", "Rufous", "Russet", "Saffron", "Sandy", "Sepia" };

        //set the name to a random name from the array
        this.name = names[rand.nextInt(names.length)];
        //set the color to a random color from the array
        this.color = colors[rand.nextInt(colors.length)];
        //set the age to a random number between 1 and 20
        this.age = rand.nextInt(20) + 1;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        //set the name to the name passed in
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //set the age to the age passed in
        this.age = age;
    }

    //toString method

    @Override
    public String toString() {
        //return the name, age, and color of the animal
        return "Animal [name=" + name + ", age=" + age + ", color=" + color + "]";
    }


    //compare to method to compare the name, then age, then color
    @Override
    public int compareTo(Animal o) {
        int compareName = this.name.compareTo(o.name);
        if (compareName != 0) {
            return compareName;
        }
        int compareAge = this.age - o.age;
        if (compareAge != 0) {
            return compareAge;
        }
        int compareColor = this.color.compareTo(o.color);
        if (compareColor != 0) {
            return compareColor;
        }
        return compareColor;
        
        
       
    }

    public Animal getRandomAnimal() {
        return null;
    }

    public Animal[] getRandomAnimals(String animalType, int i) {
        return null;
    }

}
