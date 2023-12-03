public class Task2 {
    public static void main(String[] args) {
        System.out.println("The Sum of the numbers in the array is: "
        + calcSumArray(new int[]{5}));
    }
    public static int calcSumArray(int[] arr)
    {
        int result = 0;
        for (int i=0; i < arr.length; i++){
            result += arr[i];
        }
        return result;
    }

}
