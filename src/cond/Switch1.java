package cond;

public class Switch1 {

    public static void main(String[] args) {
        int grade = 2;

        switch (grade) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
        }

        int coupon = switch (grade){
            case 1 -> 1000;
            case 2 -> 2000;
            default -> 3000;
        };

        System.out.println(coupon);
    }
}
