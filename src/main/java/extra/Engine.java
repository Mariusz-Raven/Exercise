package extra;

public class Engine {
    private Double capacity;
    private Integer horsePower;
    private Double fuelConsumption;

    public Engine(Double capacity, Integer horsePower, Double zuzyciaPaliwa) {
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.fuelConsumption = zuzyciaPaliwa;
    }

    public Double getCapacity() {
        return this.capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public Integer getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public Double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "Pojemność: " + this.capacity + "\nMoc silnika: " + this.horsePower + " Koni Mechanicznych " + "\nZużycie paliwa: " + fuelConsumption + " litrów";
    }

}
