package mario;

public class Zad7 {

    public static int[] arithemicSeries(int lenght, int firstValue, int diff) {
        int[] tab = new int[lenght];
        if (lenght < 2) {
            System.out.println("Ciąg misui mieć co najmniej 2 elementy");
            int[] emtyTable = {};
            return emtyTable;

        }

        int[] tab1 = new int[lenght];
        tab1[0] = firstValue;
        for (int i = 1; i < lenght; i++) {
            tab1[i] = tab1[i - 1] + diff;
        }
        return tab1;
    }

}


