package cond;

public class If3 {

    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        discountMany(price, discount, age);
        System.out.println();
        discountOnce(price, discount, age);
    }

    private static void discountOnce(int price, int discount, int age) {

        System.out.println("Discount Once");
        if (price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }else if (age <= 10) {
            discount += 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("discount = " + discount);
    }

    private static void discountMany(int price, int discount, int age) {

        System.out.println("Discount Many");
        if (price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if (age <= 10) {
            discount += 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("discount = " + discount);
    }
}
