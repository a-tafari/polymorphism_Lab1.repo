package PolymorphismLab1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by abijah on 9/26/16.
 */
public class userInput {

    private int numberOfPets;
    private ArrayList<Pets> typeAndName;
    private String name;
    private String type;

    public void getNumberOfPets() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        this.numberOfPets = input.nextInt();
    }

    public void getInfo(){
        getNumberOfPets();
        gettypeAndName();
    }

//    public String getNumberOfPets() {
//        return "You have " + numberOfPets + " of pets.";
//    }


    public ArrayList<Pets> gettypeAndName() {
        ArrayList<Pets> newPets = new ArrayList<Pets>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numberOfPets; i++) {
            System.out.println("What is your pets name?");

            name = input.next();
            System.out.println("What type of pet is it?");
            type = input.next();
            Pets pets = assignType(type);
            pets.setName(name);
            newPets.add(pets);
        }
        return newPets;
    }

    public Pets assignType(String type) {
        type = type.toLowerCase();
        switch (type) {
            case "dog":
                return new Dog();

            case "cat":
                return new Cat();

            case "pig":
                return new Pig();

            default: return null;
        }



    }

    public void showPets() {
        for (Pets pets : typeAndName) {
            System.out.println("A " + pets.getName() + " says " + pets.speak());
        }
    }
}
