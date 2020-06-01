package OOP3;

import java.util.Objects;

public class Cat extends Animal {
private Integer number;
    private String nameCat;


    public Cat (String nameCat){
        this.nameCat = nameCat;
        this.number = 0;

    }

    public void makeSound(){
        System.out.println(nameCat + " miau");
    }

    public void mouse(){
        number++;
        System.out.println("Zjedzone myszy: " + this.number );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return nameCat.equals(cat.nameCat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCat);
    }

}
