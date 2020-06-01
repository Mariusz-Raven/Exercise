import java.util.ArrayList;
import java.util.List;

public class kolekcje {

    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(4);
        listNumbers.add(6);
        listNumbers.add(9);
        listNumbers.add(7);
        listNumbers.add(88);


        int size = listNumbers.size();
        System.out.println(size);

        System.out.println(listNumbers.get(0));
        System.out.println(listNumbers.get(listNumbers.size()-1));
    }
}
