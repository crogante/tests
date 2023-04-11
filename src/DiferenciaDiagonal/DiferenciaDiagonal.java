package DiferenciaDiagonal;

import java.util.ArrayList;
import java.util.List;

public class DiferenciaDiagonal {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
        Integer sumaA = 0;
        Integer sumaB = 0;
        int j = arr.size();
        for(int i = 0; i<arr.size(); i++) {
            sumaA += arr.get(i).get(i);
            sumaB += arr.get(i).get(j-1);
            j--;
        }
        return  Math.abs(sumaA - sumaB);
    }


    public static void main(String[] args) {
        List<List<Integer>> matriz = new ArrayList<>();
        List<Integer> lista1 = new ArrayList<>();
        lista1.add(11);
        lista1.add(2);
        lista1.add(4);
        List<Integer> lista2 = new ArrayList<>();
        lista2.add(4);
        lista2.add(5);
        lista2.add(6);
        List<Integer> lista3 = new ArrayList<>();
        lista3.add(10);
        lista3.add(8);
        lista3.add(-12);


        matriz.add(lista1);
        matriz.add(lista2);
        matriz.add(lista3);

        System.out.println(diagonalDifference(matriz));
    }
}

/*
*
*  0, 0     0, 1      0, 2
*  1, 0     1, 1      1, 2
*  2, 0     2, 1      2, 2
*
* */