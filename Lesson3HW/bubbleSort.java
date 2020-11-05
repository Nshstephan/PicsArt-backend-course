import java.util.Random;

public class bubbleSort {
    public static void main(String[] args) {
        int swap = 0;
        Random r = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
		
		
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = swap;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

