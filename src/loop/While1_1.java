package loop;

public class While1_1 {
    public static void main(String[] args) {

        int count = 0;
        while (count < 10) {
            System.out.println(count);
            ++count;
        }

        int num = 1;
        int sum = 0;
        int endNum = 3;
        while (num <= endNum) {
            sum += num;
            num += 1;
        }

        System.out.println(sum);

        num = 1;
        sum = 0;
        endNum = 3;

        do {
            sum += num;
            num += 1;
        } while (num <= endNum);

        System.out.println(sum);
    }
}
