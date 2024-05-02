package com.tekwillacademy.ZooClubservice;

public class Cat extends Animal {

     public Cat(String name)
     {
         super(name);
     }
    public void makeSound(){
        System.out.println(this.getName() +" The cat is making Meaw");

    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " The cat id eating fish");
    }
}
