import java.util.Scanner;
import java.util.Stack;

public class CambioDeBaseV1 {

    private static final Double BASE_2_CONSTANT = 2.0;

    public static String convertirABase2(String palabra1) {
        int numero1 = Integer.parseInt(palabra1);
        var s = new Stack<Integer>();
        do {
            double resultado = numero1 % BASE_2_CONSTANT;
            int resultadoAEntero = (int) resultado;
            s.push(resultadoAEntero);
            double division = numero1 / BASE_2_CONSTANT;
            numero1 = (int) Math.floor(division);
        } while (numero1 > 0);

        StringBuilder converted = new StringBuilder();
        while (s.size() > 0) {
            converted.append(s.pop());
        }

        return converted.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa numero en base decimal");
        String palabra1 = scanner.next();
        System.out.println("Convertido a base 2: " + convertirABase2(palabra1));
    }
}