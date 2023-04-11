import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HayUnParSumanX {

    public static boolean isAtLeastOnePairThatSumX(final List<Integer> numbers, final int x) {
        HashSet<Integer> mySet = new HashSet<>();
        for (Integer number: numbers) {
            int y = x - number;
            if (mySet.contains(y)) {
                return true;
            }
            mySet.add(number);
        }
        return false;
    }

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(14);
        int x = 15;
        System.out.println(isAtLeastOnePairThatSumX(lista, x));
    }
}


/*

i    | j   |  v(i)  |  v(j)   | v(i) + v(j)
--------------------------------------------




 */

