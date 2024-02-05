package array;

public class Array1 {

    public static void main(String[] args) {
        int[] students = new int[6];

        students[0] = 10;
        students[1] = 20;
        students[2] = 30;
        students[3] = 40;
        students[4] = 50;
        students[5] = 60;

        for (int student : students) {
            System.out.println(student);
        }
    }
}
