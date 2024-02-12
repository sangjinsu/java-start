package array;

import java.util.Scanner;

public class Array6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // scan math, english, science scores in multiple students
        // total, average

        System.out.print("Enter the number of students: ");
        int studentCount = scanner.nextInt();

        int[][] students = new int[studentCount][3];

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                System.out.print("Enter student " + (i + 1) + " score: ");
                students[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < students.length; i++) {
            int total = 0;
            for (int j = 0; j < students[i].length; j++) {
                total += students[i][j];
            }
            System.out.println("Student " + (i + 1) + " total: " + total);
            System.out.println("Student " + (i + 1) + " average: " + (double) total / students[i].length);
        }


    }
}
