package Zad1JavaExercise1Mz;

import java.util.ArrayList;
import java.util.List;

public class Zad2 {

public static void main(String[] args){

    List<Integer> listNumbers = new ArrayList<>();
    listNumbers.add(10);
    listNumbers.add(4);
    listNumbers.add(-23);
    listNumbers.add(99);

    System.out.println(listNumbers.size());

    System.out.println(listNumbers.get(0));

    System.out.println(listNumbers.get(listNumbers.size()-1));


}

}
