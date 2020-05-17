package mario;

public class Zad8 {
    public static boolean aremathicStringA(int[] tab) {
        if (tab.length < 2) {
            System.out.println("Ciąg musi mieć co najmniej dwa elementy");
            return false;
        }
        boolean aString = true;
        int a = tab[1] - tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] - tab[i - 1] != a) {
                aString = false;
                break;
            }

        }
        return aString;
    }
}
