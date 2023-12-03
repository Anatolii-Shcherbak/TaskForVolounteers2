public class Task1 {
    public static String Func(int n) {
        String result = "+";
        for (int i = 1; i < n; i++) {
            if (i % 2 == 1) {
                result += ("-");
            } else {
                result += ("+");
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 8;
        System.out.println("for n=" + n1 + ": " + Func(n1));
        System.out.println("for n=" + n2 + ": " + Func(n2));
    }
}
