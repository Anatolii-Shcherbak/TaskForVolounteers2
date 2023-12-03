public class Task5 {
    public static void main(String[] args) {
        System.out.println(repFirstChar("6est"));
    }
    public static String repFirstChar(String s)
    {
        char c = s.charAt(0);
        if (Character.isUpperCase(c)) {
            return "upper";
        }else if (Character.isLowerCase(c)) {
            return "lover";
        } else if (Character.isDigit(c)) {
            return "digit";
        } else {
            return "other";
        }
    }
}
