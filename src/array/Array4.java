package array;

import java.util.Scanner;

public class Array4 {

    public static void main(String[] args) {
        int[] students = {
                10, 20, 30, 40, 50, 60
        };

        int total = 0;
        double average = 0;

        for (int student : students) {
            total += student;
        }

        System.out.println(total);
        average = (double) total / students.length;
        System.out.println(average);

        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter a number: ");
            nums[i] = scanner.nextInt();
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.println();
        // reverse
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

        scanner.close();
    }
}
