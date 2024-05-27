package ES2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Inserisci il numero di km percorsi");
            double kmPercorsi = Double.parseDouble(sc.nextLine());

            System.out.println("Inserisci il numero di litri di carburante consumati");
            double lCarburante = Double.parseDouble(sc.nextLine());
            if (lCarburante == 0) {
                throw new ArithmeticException("Non si può dividere per 0");
            }

            System.out.println("Hai percorso " + (kmPercorsi / lCarburante) + " km/l");
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        } catch (InputMismatchException exception) {
            System.err.println("Devi inserire valori numerici");
        } finally {
            sc.close();
        }
    }
}
