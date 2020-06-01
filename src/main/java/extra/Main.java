package extra;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine(1.7, 120, 9.1);
        String info = engine.toString();
        Engine engine1 = new Engine(5.2,380,13.3);
//        System.out.println(info);
//        System.out.println(engine.getCapacity());
//        engine.setCapacity(3.0);
//        System.out.println(engine.getCapacity());
//        System.out.println(engine);

        Car sportsCar = new SportsCar("BMW", "M3", "Red", 2, engine);
        Car sportsCar1 = new SportsCar("Porsche", "Cayene", "Blac Pearl", 2, engine1);
//        System.out.println(sportsCar.toString());
//        System.out.println(sportsCar1);

        List<Car> car = new ArrayList<>();
        car.add(sportsCar);
        car.add(sportsCar1);
        for (Car cars : car) {
            System.out.println(cars);
        }



    }
}
