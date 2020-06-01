package Zad1JavaExercise1Mz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę zmiennoprzecinkową nr 1: ");
        Double one = in.nextDouble();
        System.out.println("Podaj liczbę zmiennoprzecinkową nr 2: ");
        Double two = in.nextDouble();
        System.out.println("Podaj liczbę zmiennoprzecinkową nr 3: ");
        Double three = in.nextDouble();
        System.out.println("Podaj liczbę zmiennoprzecinkową nr 4: ");
        Double four = in.nextDouble();
        System.out.println("Podaj liczbę zmiennoprzecinkową nr 5: ");
        Double five = in.nextDouble();
        System.out.println("Podaj liczbę zmiennoprzecinkową nr 6: ");
        Double six = in.nextDouble();
        List<Double> numbers = new ArrayList<>();
        numbers.add(one);
        numbers.add(two);
        numbers.add(three);
        numbers.add(four);
        numbers.add(five);
        numbers.add(six);
        System.out.println();
        System.out.println(numbers.get(0) + numbers.get(numbers.size() - 1));
        System.out.println(numbers.get(0) * numbers.get(numbers.size() - 1));
        System.out.println(numbers.get(1) / numbers.get(numbers.size() - 2));

    }


}
