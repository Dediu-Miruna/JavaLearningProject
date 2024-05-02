package com.tekwillacademy.ZooClubservice;


public class Dog extends Animal implements{


    public  Dog(String dogName){
        super(dogName);
    }
    @Override
    public void makeSound() {
        System.out.println(" The dog is making: Rrrrr");
    }

    @Override
    public void eat() {
        System.out.println(getName() + "  is eating bones");
    }
}
