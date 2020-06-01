package Zad1JavaExercise1Mz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dodaj pierwsze imię: ");
        String firstName = in.nextLine();
        System.out.println("Dodaj drugie imię: ");
        String secondName = in.nextLine();
        System.out.println("Dodaj trzecie imię: ");
        String thirdName = in.nextLine();
        System.out.println("Dodaj czwarte imię: ");
        String fourthName = in.nextLine();
        System.out.println("Dodaj piąte imię: ");
        String fifthName = in.nextLine();

        String comma = ", ";

        List<String> listOfNames = new ArrayList<>();
        listOfNames.add(firstName);
        listOfNames.add(secondName);
        listOfNames.add(thirdName);
        listOfNames.add(fourthName);
        listOfNames.add(fifthName);

        for(String names : listOfNames){
            System.out.print(names + " | ");
        }
        System.out.println();
        for(int i = listOfNames.size()-1; i>=0; i--){
            System.out.print(listOfNames.get(i) + " | ");
        }
    }
}
