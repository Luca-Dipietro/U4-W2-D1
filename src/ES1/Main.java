package ES1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] RandomArray = new int[5];
        Random numRandom = new Random();
        for (int i = 0; i < RandomArray.length; i++) {
            RandomArray[i] = numRandom.nextInt(10) + 1;
        }

        System.out.println("Array Iniziale");
        System.out.println(Arrays.toString(RandomArray));
        System.out.println();

        while (true) {
            try {
                System.out.println("Scegli la posizione dell'array");
                int pos = Integer.parseInt(sc.nextLine());

                if (pos < 0 || pos >= RandomArray.length) {
                    throw new ArrayIndexOutOfBoundsException("Posizione non valida");
                }

                System.out.println("Inserisci il numero");
                int num = Integer.parseInt(sc.nextLine());

                if (num == 0) {
                    break;
                } else {
                    RandomArray[pos] = num;
                    System.out.println(Arrays.toString(RandomArray));
                    System.out.println();
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println(e.getMessage());

            } catch (Exception e) {
                System.err.println("Devi inserire un numero intero");
            }
        }

        sc.close();
    }

}
