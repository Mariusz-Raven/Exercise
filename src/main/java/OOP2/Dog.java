package OOP2;

public class Dog extends Animal implements Movable {
    String name;
    public Dog(String name){
        this.name = name;
    }
    public void makeSound(){
        System.out.println("Pies wabi się: " + this.name + " oraz wydaje dźwięk Woof, woof");
    }

    @Override
    public void move() {
        System.out.println("Idę");
    }
}
