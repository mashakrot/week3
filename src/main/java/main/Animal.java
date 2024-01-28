package main;

import java.util.ArrayList;

public class Animal 
{
    private String species;
    private String name;
    private int age;
    private ArrayList<Zoo> zooAnimals = new ArrayList<>();

    // public Animal() {
    //     species = "Hedgehog";
    //     name = "Pikseli";
    //     age = 5;
    // }

    public Animal(String species, String name, int age){
        this.species = species;
        this.name = name;
        this.age = age;

        ArrayList<Zoo> animals = new ArrayList<>();
        animals.add(new Zoo("Species1", "Name 1", 1000));
        animals.add(new Zoo("Species1", "Name 1", 1000));
        animals.add(new Zoo("Species1", "Name 1", 1000));

        this.zooAnimals = animals;
    }

    public void printAnimals(){
        System.out.println(this.species + ": " + this.name + ", " + this.age + " years");
    }
    
    public void run(int laps){
        for (int i =1; i <= laps; i++) {
            // for (Zoo zoo: zooAnimals){  
            System.out.println(this.name + " runs really fast!");
            
        }

    }
}

