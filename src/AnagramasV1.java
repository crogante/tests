import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramasV1 {

    public static boolean isAnagram(String palabra1, String palabra2) {

        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();

        Map<Character, Integer> mapaDeFrecuencias = new HashMap<>();

        for (int indice = 0; indice < palabra2.length(); indice++) {
            char letra = palabra2.charAt(indice);
            if (!mapaDeFrecuencias.containsKey(letra)) {
                mapaDeFrecuencias.put(letra, 1);
            } else {
                Integer frecuenciaPalabra = mapaDeFrecuencias.get(letra);
                mapaDeFrecuencias.put(letra, ++frecuenciaPalabra);
            }
        }

        for (int indice = 0; indice < palabra1.length(); indice++) {
            char letra = palabra1.charAt(indice);
            if (!mapaDeFrecuencias.containsKey(letra)) {
                return false;
            }
            Integer frecuenciaPalabra = mapaDeFrecuencias.get(letra);
            if (frecuenciaPalabra==0){
                return false;
            } else {
                mapaDeFrecuencias.put(letra, --frecuenciaPalabra);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa palabra 1");
        String palabra1 = scanner.next();
        System.out.println("Ingresa palabra 2");
        String palabra2 = scanner.next();
        if (isAnagram(palabra1, palabra2)) {
            System.out.println("Validacion Anagramas : Positivo");
        } else {
            System.out.println("Validacion Anagramas : Negativo");
        }
    }
}