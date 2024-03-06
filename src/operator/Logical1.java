package operator;

public class Logical1 {

    public static void main(String[] args) {

        System.out.println(true && true); // T
        System.out.println(true && false); // F
        System.out.println(false && false); // F

        System.out.println(true || true); // T
        System.out.println(true || false); // T
        System.out.println(false || false); // F

        System.out.println(!true); // F
        System.out.println(!false);  // T



    }
}
