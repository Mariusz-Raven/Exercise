package OOP4;

public class Rectangle extends Figure {

    float sideA;
    float sideB;

    public Rectangle(float sideA, float sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public float countArea(){
        return 2*sideA + 2*sideB;
    }

    public void displayArea(){
        System.out.println("Figura: prostokąt, pole powierzchni " + countArea());
    }


}
