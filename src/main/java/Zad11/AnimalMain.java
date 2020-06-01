package Zad11;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {
    public static void main(String args[]) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

//        Animal[] animals = {cat, dog, cow};
        List<Animal> listanimals = new ArrayList<Animal>();
        listanimals.add(cat);
        listanimals.add(dog);
        listanimals.add(cow);

//        for (Animal animal : animals) {
//            System.out.println(animal.makeSound());

            for (Animal animal1 : listanimals) {
                System.out.println(animal1.makeSound());
            }


        }
    }



