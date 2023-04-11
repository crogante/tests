package EjercicioTripletas;

import java.util.ArrayList;
import java.util.List;

public class TripletasV1 {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(0);
        for (int indice = 0; indice < a.size(); indice++) {
            if (a.get(indice) > b.get(indice)) {
                result.set(0, result.get(0) + 1);
            } else if (a.get(indice) < b.get(indice)) {
                result.set(1, result.get(1) + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> tripletaUno = new ArrayList<>();
        tripletaUno.add(1);
        tripletaUno.add(2);
        tripletaUno.add(3);
        List<Integer> tripletaDos = new ArrayList<>();
        tripletaDos.add(3);
        tripletaDos.add(2);
        tripletaDos.add(1);
        System.out.println(compareTriplets(tripletaUno, tripletaDos));
    }
}