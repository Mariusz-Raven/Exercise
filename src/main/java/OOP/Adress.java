package OOP;

public class Adress {

    String street, city, country;
    int noFlat, noHome;

    public Adress(String street, String city, String country, int noFlat, int noHome) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.noFlat = noFlat;
        this.noHome = noHome;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getFlatNO() {
        return noHome;
    }

    public void setFlatNO(int flatNO) {
        this.noHome = noHome;
    }

    public int getHomeNO() {
        return noHome;
    }

    public void setHomeNO(int noHome) {
        this.noHome = noHome;
    }

    public String toString() {
return "Address {" +
        "street='" + street + '\'' +
        ", city='" + city + '\'' +
        ", country='" + country + '\'' +
        ", noFlat=" + noFlat +
        ", noHome=" + noHome+
        '}';
    }
}

