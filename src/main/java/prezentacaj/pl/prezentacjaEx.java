package prezentacaj.pl;

import java.util.*;

public class prezentacjaEx {


    public static void exList(){

        List<String> listOfNames = new ArrayList<String>();
        listOfNames.add("Mario");
        listOfNames.add("Kasia");
        listOfNames.add("Basia");
        System.out.println("Before: " + listOfNames.size());
        listOfNames.add("Daniel");
        System.out.println("After: " +listOfNames.size());
    }
    public static void exSet(){

        Set<String> setOfNames = new HashSet<String>();
        setOfNames.add("Mario");
        setOfNames.add("Kasia");
        setOfNames.add("Basia");
        System.out.println("Before: " + setOfNames.size());
        setOfNames.add("Mario");
        System.out.println("After: " +setOfNames.size());
    }

    public static void exMap(){

        Map<String,Integer> mapOfNames = new HashMap<String, Integer>();
        mapOfNames.put("Mario",1);
        mapOfNames.put("Kasia",2);
        mapOfNames.put("Basia",3);
        System.out.println("Before: " + mapOfNames.size());
        mapOfNames.put("Mario",3);
        System.out.println("After: " +mapOfNames.size());
    }

    public static void main(String[] args){
        System.out.println("Listy: ");
        exList();
        System.out.println("Zbiory");
        exSet();
        System.out.println("Mapy: ");
        exMap();
    }
}

