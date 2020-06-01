package OOP2;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Gucio");
        Cat cat1 = new Cat("Filemon");
        Cat cat2 = new Cat("Ancymon");
        Cat cat3 = new Cat("Kitek");
        Dog dog = new Dog("Kajtek");
        Dog dog1 = new Dog("Reksio");
        Dog dog2 = new Dog("Liluk");
        Dog dog3 = new Dog("Burek");

        Cat[] koty = {cat, cat1, cat2, cat3,};
        for (Cat cats : koty) {
            cats.makeSound();
        }

        System.out.println();

        cat.eatMouse();
        cat.eatMouse();
        cat.eatMouse();
        cat.eatMouse();

        System.out.println();

        Dog[] psy = {dog, dog1, dog2, dog3};
        for (Dog dogs : psy) {
            dogs.makeSound();
        }

        System.out.println();

        Animal[] animals = {cat, dog, cat1, dog1, cat2, dog2};
        for (Animal animals1 : animals) {
            animals1.makeSound();
        }
        cat.move();

        Vet vet = new Vet();
        vet.sayHello(cat,dog);
        vet.sayHello(cat1,dog1);
    }
}
