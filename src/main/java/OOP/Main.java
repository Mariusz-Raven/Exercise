package OOP;

public class Main {

    public static void main(String[] args){

        Person emptyPerson = new Person();
        Adress adres = new Adress("Cwiartki","Wroclaw","Polska",3,4);
        Person person = new Person("Ferdek","Kiepski",52,adres);
        person.toString();
//        System.out.println(person.toString());
//        System.out.println(emptyPerson.toString());
//        System.out.println(person.introduce());
//
//        System.out.println(person.getName());
//        person.setName("Marcin");
        System.out.println(person.getName());
        Adress adreNew = new Adress("Bąka","Poznan","Polska",1,7);
        System.out.println(person.toString());
        person.setAdres(adreNew);
        System.out.println(person.getAdres());


    }
}
