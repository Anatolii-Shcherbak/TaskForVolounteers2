import java.util.Arrays;

public class Task4 {


    public static int sortDigits(int number) {
        String numberStr = Integer.toString(number);
        char[] digits = numberStr.toCharArray();

        char  temp;
        boolean toSort = true;

        for (int i = 1; i<digits.length && toSort; i++) {
            toSort = false;

            for (int j = 0; j < digits.length - i; j++) {
                if (digits[j] < digits[j + 1]) {
                    temp = digits[j + 1];
                    digits[j + 1] = digits[j];
                    digits[j] = temp;
                    toSort = true;
                }
            }
        }
        String sortedStr = new String(digits);
        int sortedNumber = Integer.parseInt(sortedStr);
        return sortedNumber;
    }


    public static void main(String[] args) {
        int n1 = 213;
        int n2 = 553;
        System.out.println("Largest in family of " + n1 + ": " +  sortDigits(n1));
        System.out.println("Largest in family of " + n2 + ": " + sortDigits(n2));
    }
}
