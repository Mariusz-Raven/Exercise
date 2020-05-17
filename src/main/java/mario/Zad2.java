package mario;

public class Zad2 {
    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) isPrime = false;

        }
        return isPrime;
    }
}

