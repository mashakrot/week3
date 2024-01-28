package main;

import java.util.Scanner;
import java.util.ArrayList;


public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);


        System.out.println( "Please, name the zoo:" );
        String zooName = sc.nextLine();

        ArrayList<Animal> animals = new ArrayList<>();
        Animal defAnimal = new Animal();
        animals.add(defAnimal);

        boolean exit = false;
        while (!exit) {
            System.out.println("1) Create a new animal, 2) List all animals, 3) Run animals, 0) End the program");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch (i) {
                    case 1:
                        System.out.println("What species?");
                        String species = sc.nextLine();
                        System.out.println("Enter the name of the animal:");
                        String name = sc.nextLine();
                        System.out.println("Enter the age of the animal:");
                        String ageStr = sc.nextLine();
                        int age = Integer.parseInt(ageStr);
                        
                        Animal newAnimal = new Animal(species, name, age);
                        animals.add(newAnimal);
                        break;
                    case 2:
                        System.out.println(zooName + " contains the following animals:");
                        for (Animal animal: animals){
                            animal.printAnimals();
                        }
                        
                        break;
                    case 3:
                        System.out.println("How many laps?");
                        String lapsStr = sc.nextLine();
                        int laps = Integer.parseInt(lapsStr);
                        for (Animal animal: animals){
                            animal.run(laps);
                        }
                        
                        break;
                    case 0:
                        System.out.println("Thank you for using the program.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Wrong input value");;
                        break;
                }
            }
        }
    }
}
