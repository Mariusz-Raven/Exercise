package OOP;

public class Person {
    private String name;
    private int age;
    private String surname;
    Person adress;


    public Person() {

    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    public Person(String name, String surname, int age, Person InPutAdress) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = InPutAdress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getAddress() {
        return adress;
    }

    public void setAddress(Person adress) {
        this.adress = adress;
    }

    public void introduce() {
        System.out.println("Name: " + name + "Surname: " + surname + "Age: " + age + "Corespondence: " + adress);
    }

}
