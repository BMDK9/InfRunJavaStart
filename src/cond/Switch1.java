package cond;

public class Switch1 {

    public static void main(String[] args) {
        int grade = 2;
        int coupon = 0;

        good(grade, coupon);
        System.out.println();
        bad(grade, coupon);
        System.out.println();
        newSwitch(grade, coupon);
    }

    private static void newSwitch(int grade, int coupon) {
        System.out.println("new Switch");

        coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("coupon = " + coupon);
    }

    private static void bad(int grade, int coupon) {
        System.out.println("bad");
        switch (grade) {
            case 1:
                coupon = 1000;

            case 2:
                coupon = 2000;

            case 3:
                coupon = 3000;

            default:
                coupon = 500;
        }

        System.out.println("coupon = " + coupon);
    }

    private static void good(int grade, int coupon) {
        System.out.println("good");
        switch (grade) {
            case 1:
                coupon = 1000;
                break;

            case 2:
                coupon = 2000;
                break;

            case 3:
                coupon = 3000;
                break;

            default:
                coupon = 500;
        }

        System.out.println("coupon = " + coupon);
    }
}
