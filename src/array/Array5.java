package array;

import java.util.Scanner;

public class Array5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // scan numbers length and scan numbers
        // min and max number
        System.out.print("Enter the length of numbers: ");
        int length = scanner.nextInt();
        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.println(min);
        System.out.println(max);

    }
}
