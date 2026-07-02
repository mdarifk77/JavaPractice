// Optimal Approach sum method:

public class MissingNumber2 {
    public static int missingNumber(int [] arr, int N){

        int expectedSum = N * (N+1) / 2;
        int actualSum = 0;

        for(int num = 0; num < arr.length; num++){
            actualSum += arr[num];

        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int [] arr = { 1, 2, 4, 5, 6};
        System.out.println(missingNumber(arr , 6));
    }
}
