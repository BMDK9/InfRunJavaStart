package array;

public class EnhancedFor1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            System.out.println("일반 " + num);
        }

        for (int num : numbers) {
            System.out.println("향상 " + num);
        }
    }
}
