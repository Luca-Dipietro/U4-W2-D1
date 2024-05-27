package ES0;

public class Main {
    public static void main(String[] args) {
        int[] numeri = {4, 7, 1, 9, 2, 5};

        int massimo = trovaMassimo(numeri);

        System.out.println("Il massimo valore nell'array è: " + massimo);
    }

    public static int trovaMassimo(int[] array) {

        int max = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
        }
        
        return max;
    }
}
