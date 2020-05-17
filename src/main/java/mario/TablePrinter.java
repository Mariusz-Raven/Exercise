package mario;

public class TablePrinter {
    public static void tablesPrinter(int[] tab){
        for (int element : tab) {
            System.out.print(" [" + element + "] ");
        }
        System.out.print("\n");
    }
}

