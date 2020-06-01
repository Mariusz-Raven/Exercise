package extra;

public class SportsCar extends Car {


    public SportsCar(String procuder, String model, String color, Integer seatNumbers, Engine engine) {
        super(procuder, model, color, seatNumbers, engine);
    }

    public String toString() {
        return "Producent: " + procuder + "\nModel: " + model + "\nKolor: " + color + "\nl. siedzeń: " + seatsNaumber + "\nSilnik\n" + engine;
    }
}
