package Zad11;

public class Cow implements Animal{

    private String sound;

    public Cow(){
        this.sound = "Muuuuu";
    }


    @Override
    public String makeSound() {
        return this.sound;
    }
}
