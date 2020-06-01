package OOP3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat ("Filemon");
//        Cat cat1 = new Cat ("Filemon");
//        Cat cat2 = new Cat ("piu");
//        Cat cat3 = new Cat ("Ancymon");
//
//        Set<Cat> zbiorKotow = new HashSet<>();
//        zbiorKotow.add(cat);
//        zbiorKotow.add(cat1);
//        zbiorKotow.add(cat2);
//        zbiorKotow.add(cat3);
//        for (Cat kot : zbiorKotow){
//           kot.makeSound();
//        }
//        cat.mouse();
//        cat.mouse();
//        cat.mouse();
//        cat.mouse();

        Dog dog = new Dog("Rex");
//        dog.makeSound();
        Cat cat = new Cat("Mruczek");
//        cat.makeSound();
//        System.out.println(dog.makeSounddefault());
//        System.out.println(cat.makeSounddefault());

        List<Animal> animals = new LinkedList<>();
        animals.add(cat);
        animals.add(dog);
        for (Animal animal : animals){
            animal.makeSound();
        }
    }
}
