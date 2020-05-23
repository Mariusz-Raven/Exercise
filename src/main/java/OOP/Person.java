package OOP;

public class Person {

    private String name;
    private String surname;
    private Integer age;
    private Adress adres;

    public Person() {
    }

    public Person(String name, String surname, Integer howOld, Adress adres){
        this.name = name;
        this.surname = surname;
        this.age = howOld;
        this.adres = adres;


    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public Integer getAge(){
        return this.age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public Adress getAdres(){
        return this.adres;
    }

    public void setAdres(Adress adres){
        this.adres = adres;
    }



    public String introduce(){
        return "My name is: " + this.name + " My surneme is: " + this.surname + " My age is: " + this.age + " Adres: " + this.adres.toString();

    }

    @Override
    public String toString(){
        String information = "name: " + this.name + " surname: " + this.surname + " age: " + this.age + " Adres: " + this.adres.toString();
        return information;
    }


}
