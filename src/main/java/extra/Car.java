package extra;

public abstract class Car {

    protected String procuder;
    protected String model;
    protected String color;
    protected Integer seatsNaumber;
    protected Engine engine;

    public String getProcuder() {
        return procuder;
    }

    public void setProcuder(String procuder) {
        this.procuder = procuder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSeatsNaumber() {
        return seatsNaumber;
    }

    public void setSeatsNaumber(Integer seatsNaumber) {
        this.seatsNaumber = seatsNaumber;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car(String procuder, String model, String color, Integer seatNumbers, Engine engine) {
        this.seatsNaumber = 2;
        this.procuder = procuder;
        this.model = model;
        this.color = color;
        this.seatsNaumber = seatNumbers;
        this.engine = engine;
    }

    public String toString() {
        return "Producent: " + procuder + "\nModel: " + model + "\nKolor: " + color + "\nl. siedzeń:" + seatsNaumber + "\nSilnik " + engine;

    }

}
