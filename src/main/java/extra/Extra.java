package extra;

public class Extra {

    public static int multiply(int[] table) {
        return table[0] * table[1];
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int chooseOpr(int[] table) {
        if (table.length == 2) {
            return multiply(table);
        } else if (table.length == 3) {
            int tmp = multiply(table);
            return add(tmp, table[2]);
        }
        return 0;
    }

    public static void main(String args[]) {

        int[] table = {7, 5};
        int[] table1 = {4, 5, 7};

        int score = chooseOpr(table);
        System.out.println(score);

        int score1 = chooseOpr(table1);
        System.out.println(score1);

    }

}
