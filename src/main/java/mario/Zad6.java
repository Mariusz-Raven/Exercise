package mario;

public class Zad6 {
public static int[] countNumb(int[] tab){
//   liczby ujemne
//    int[] tab = {2,5,-10,5,-12,-9};
    int count = 0;
    for(int numb : tab){
        if(numb < 0){
            count++;//count = count+1
        }
}
    //tworzymy tablice
    int[] out = new int[count];//x rozmiar = pusta
    int outIt = 0;
    //wypełniamy nową tablicę zwrotną
    for(int numb : tab){
        if(numb <0) {
            out[outIt] = numb;
            outIt++;
        }
    }
    return out;
    }

}
