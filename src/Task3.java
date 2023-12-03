import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static int[] generateSumZeroArray(int n) {
        int[] arr = new int[n];
        Random rand = new Random();
        int sum = 0;

        for (int i = 0; i < n - 1; i++) {
            arr[i] =  rand.nextInt(25);
            sum += arr[i];
        }

        arr[n - 1] = -sum;

        return arr;
    }

    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 3;

        int[] result1 = generateSumZeroArray(n1);
        int[] result2 = generateSumZeroArray(n2);

        System.out.println("SumZeroArray for n=" + n1 + ": " + Arrays.toString(result1));
        System.out.println("SumZeroArray for n=" + n2 + ": " + Arrays.toString(result2));
    }
}
