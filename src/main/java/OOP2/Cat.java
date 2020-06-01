package OOP2;

public class Cat extends Animal implements Movable {
    String name;
    int eatMouse = 0;
    public Cat(String name){
        this.name = name;
    }
    public void makeSound(){
        System.out.println("Kot wabi się: " + this.name + " oraz wydaje dźwięk Miau,maiu");
    }
    public void eatMouse(){
        eatMouse++;
        System.out.println("Kot zjadł: " + eatMouse + " mysz\\ę");
    }

    @Override
    public void move() {
        System.out.println("idę");
    }
}
