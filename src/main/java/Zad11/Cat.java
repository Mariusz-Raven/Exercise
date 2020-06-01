package Zad11;

public class Cat implements Animal {

    private String sound;

    public Cat(){
        this.sound = "Miau";

    }

    @Override
    public String makeSound() {
        return this.sound;
    }
}

