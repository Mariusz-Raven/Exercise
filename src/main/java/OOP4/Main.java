package OOP4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(100, 890);
        Square square = new Square(10);
        Circle circle = new Circle(8);

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę figur: ");
        Integer lf = Integer.valueOf(in.nextLine());

        System.out.println("Podaj fihgure p - prost, o - okręg, k - kwadrat: ");
        String in1 = in.nextLine();


        for (int i = 0; i < lf; i++) {
            if (in1.equalsIgnoreCase("p")) {
                rectangle.displayArea();
            } else if (in1.equalsIgnoreCase("k")) {
                square.displayArea();
            }else if (in1.equalsIgnoreCase("o")){
                circle.displayArea();
            }

        }

        List<Figure> figures = new ArrayList<>();
        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }


//            Rectangle prostokat = new Rectangle(20000, 300000) {
//                public void displayArea() {
//                    super.displayArea();
//                }
//            };
//
//            prostokat.displayArea();


    }
}
