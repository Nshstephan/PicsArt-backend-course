import java.util.Scanner;
import java.util.Random;

public class lesson2hw {
    public static void main(String[] args) {

        // Task 1 Create an array and fill it with 2 number.
        Random f = new Random();
        int[] array = new int[2];
        for (int i = 0; i < array.length; i++) {
            array[i] = f.nextInt(100);
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Task 2 Create an array and fill it with numbers from 1:1000.
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        //Task 3 Create an array and fill it with odd numbers from -20:20
        int[] ar = new int[20];
        for (int i = -19; i < 20; i += 2) {
            ar[(i + 19) / 2] = i;
        }
        for (int element : ar) {
            System.out.print(element + " ");
        }
        System.out.println();

        //Task 4 Create an array and fill it. Print all elements which can be divided by 5.
        int[] aray = {21, 1991, 40, 100, 55, 78, 54, 36, 5, 96};
        for (int i = 0; i < aray.length; i++) {
            if (aray[i] % 5 == 0) {
                System.out.print(aray[i] + " ");
            }
        }
        System.out.println();

        //Task 5 Create an array and fill it. Print all elements which are between 24.12 and 467.23.

        Random r = new Random();
        double[] valod = new double[50];
        for (int i = 0; i < valod.length; i++) {
            valod[i] = r.nextDouble() * 1000;
            if (valod[i] >= 24.12 && valod[i] <= 467.23) {
                System.out.print(String.format("%.2f", valod[i]) + " ");
            }
        }
        System.out.println();

        //Task 6 Create an array and fill it. Print count of elements which can be divided by 2.
        int count = 0;
        Random x = new Random();
        int[] massiv = new int[50];
        for (int j = 0; j < massiv.length; j++) {
            massiv[j] = x.nextInt() * 1000;
            if (massiv[j] % 2 == 0) {
                ++count;
            }
        }
        System.out.print("Total count is " + count);
        System.out.println();

        //Task 7 Given an integer, 0< N < 21 , print its first 10 multiples.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number in range of [1, 20] - ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}

