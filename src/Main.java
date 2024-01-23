import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main calculator = new Main();
        int sum = calculator.sum(1,10,123,234,6234,12,8);
        System.out.println(sum); // 6622
        System.out.printf("");

        // 2
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        sum2(a);
        sum2(1,2,3,4,5,6,7,8,9,10);
    }

    int sum(int ...numbers){
        return Arrays.stream(numbers).sum();
    }


    static void sum2(int... numbers){
        final int length = numbers.length;
        final int sum = Arrays.stream(numbers).sum();
        final String lineSeparator = System.lineSeparator();

        System.out.printf("Кол-во элементов для сложения - %d, сумма - %d%s", length, sum, lineSeparator);
    }
}