package OOP4;

public class Square extends Figure {

    float sideA;


    public Square(float sideA){
        this.sideA = sideA;

    }

    public float countArea(){
        return 4*sideA;
    }

    public void displayArea(){
        System.out.println("Figura: kwadrat, pole powierzchni " + countArea());
    }


}

