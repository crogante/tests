import java.util.Scanner;

public class PalindromoV1 {

    public static boolean esPalindromo(String oracion) {

        oracion = oracion.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
                .replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
        String invertida = new StringBuilder(oracion).reverse().toString();
        return invertida.equals(oracion);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa oracion");
        String oracion = scanner.nextLine();
        if (esPalindromo(oracion)) {
            System.out.println("Validacion palindromo : Positivo");
        } else {
            System.out.println("Validacion palindromo : Negativo");
        }
    }
}