package Zad1JavaExercise1Mz;

public class zad1 {
    public static void main(String[] args) {
        int[] table = new int[10];

        System.out.println("Długość tablicy = " + table.length);
        for (int i = 0; i < table.length; i++) {
            table[i] = i + 1;

        }
        System.out.println("Zawartość Tablicy : ");
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < table.length; i ++) {
            table[i] = i * 2;
            System.out.print(table[i] + " ");
        }
    }
}