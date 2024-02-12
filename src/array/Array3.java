package array;

public class Array3 {

    public static void main(String[] args) {
        int[][] students = {
                {10, 20, 30},
                {40, 50, 60}
        };

        for (int[] student : students) {
            for (int s : student) {
                System.out.println(s);
            }
        }

        int[] nums = {
                10, 20, 30, 40, 50, 60
        };

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
