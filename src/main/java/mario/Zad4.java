package mario;

public class Zad4 {

    public static void table(int[] tab) {
//int [] newtab = new int [3];
        int temp = tab[0];
        tab[0] = tab[2];
        tab[2] = temp;
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }

}
