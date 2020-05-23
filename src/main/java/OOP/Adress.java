package OOP;

public class Adress {
    String street;
    String city;
    String country;
    Integer noHome;
    Integer noFloat;

    public Adress(String ulica, String miasto, String kraj, Integer nrDomu, Integer nrMieszkania){
        this.street = ulica;
        this.city = miasto;
        this.country = kraj;
        this.noHome = nrDomu;
        this.noFloat = nrMieszkania;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", noHome=" + noHome +
                ", noFloat=" + noFloat +
                '}';
    }
}
