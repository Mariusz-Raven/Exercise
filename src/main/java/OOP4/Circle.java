package OOP4;

public class Circle extends Figure {

    float radius;

    public float countArea() {
        return (float) (Math.PI*(radius*radius));
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    void displayArea() {
        System.out.println("Figura: okręg, pole powierzchni " + countArea());
    }
}
