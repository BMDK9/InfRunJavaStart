package loop;

public class While2 {

    public static void main(String[] args) {
        int sum = 0;
        int plus = 0;

        while (plus < 5) {
            plus++;

            if (plus == 2) {
//            continue;
            break;
            }
            System.out.println("plus = " + plus);
            System.out.println("sum = " + (sum += plus));
            System.out.println();
        }
    }
}
