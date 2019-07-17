package com.company.lab4.AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog Oscar = new Dog();
        Oscar.setName("Oscar");
        System.out.println(Oscar.getName());
        Oscar.setAge(4);
        System.out.println(Oscar.getAge());
        Oscar.setHealth(8);
        System.out.println(Oscar.getHealth());
        Oscar.setHeighM(0.7f);
        System.out.println(Oscar.getHeighM());
        Oscar.setWeight(7);
        System.out.println(Oscar.getWeight());
        Oscar.bark();


        Cat Biby = new Cat();
        Biby.setName("Biby");
        System.out.println(Biby.getName());
        Biby.setAge(3);
        System.out.println(Biby.getAge());
        Biby.setHealth(9);
        System.out.println(Biby.getHealth());
        Biby.setHeighM(0.2f);
        System.out.println(Biby.getHeighM());
        Biby.setWeight(2);
        System.out.println(Biby.getWeight());
        Biby.meow();


        Adopter Jony = new Adopter();
         Jony.setName("Jony");
        System.out.println(Jony.getName());
        Jony.setMoney(200);
        System.out.println(Jony.getMoney());


        AnimalFood Pedigree = new AnimalFood();
        Pedigree.setName("Pedigree");
        System.out.println(Pedigree.getName());
        Pedigree.setPrice(20);
        System.out.println(Pedigree.getPrice());
        Pedigree.setQuantity(7);
        System.out.println(Pedigree.getQuantity());
        Pedigree.setDisponibility("inStock");
        System.out.println(Pedigree.getDisponibility());


        Activity Playing = new Activity();
        Playing.setActivityName("Play");
        System.out.println(Playing.getActivityName());
        Playing.play();
        Playing.run();


        Doctor Fermus = new Doctor();
        Fermus.setName("Fermus");
        System.out.println(Fermus.getName());
        Fermus.setSpecialization("surgery");
        System.out.println(Fermus.getSpecialization());
    }
}
