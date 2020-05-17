package mario;

public class Zad5 {

    public static int[] tablica(int[] tab1) {

        int min = tab1[0];
        int max = tab1[0];
        int[] tab2 = new int[2];

        for (int number : tab1) {
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
        }

        System.out.println("MAX:" + max);
        System.out.println("MIN: " + min);
        tab2[0] = min;
        tab2[1] = max;
        return tab2;
    }


    }

