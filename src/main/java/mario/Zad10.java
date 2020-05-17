package mario;

public class Zad10 {

    public static boolean testModulo(int[] tableNum, int modulo1) {
        boolean isCorect = true;
        for (int number : tableNum) {
            int myModulo1 = Zad9.alternative(number, modulo1);
            int originModulo = number % modulo1;
            if (myModulo1 != originModulo) {
                isCorect = false;
                break;
            }
        }

        return isCorect;

    }
}
