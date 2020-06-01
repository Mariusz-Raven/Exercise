package OOP3;

public class  Dog extends Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + ": Hau, hau");
    }

}
