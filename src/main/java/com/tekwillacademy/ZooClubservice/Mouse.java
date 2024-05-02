package com.tekwillacademy.ZooClubservice;

public class Mouse extends Animal {


    public Mouse(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("The mouse is making: kits");
    }


    @Override
    public void eat()
    {
        System.out.println(getName() + " The mouse is eating all the trash");

    }
}
