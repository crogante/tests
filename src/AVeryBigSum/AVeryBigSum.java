package AVeryBigSum;

import java.util.ArrayList;
import java.util.List;

public class AVeryBigSum {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
        long result = 0L;
        for (Long value : ar) {
            result+=value;
        }
        return result;
    }

    public static void main(String[] args) {
        List<Long> myArray = new ArrayList<>();
        myArray.add(400001L);
        myArray.add(400002L);
        myArray.add(400003L);
        System.out.println(aVeryBigSum(myArray));
    }
}