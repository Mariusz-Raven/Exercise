package Zad11;

public class Dog implements Animal {

    private String sound;

    public Dog() {
        this.sound = "Hau,hau";
    }


    @Override
    public String makeSound() {
        return this.sound;
    }
}