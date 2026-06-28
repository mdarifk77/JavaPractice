
// Brute Force solution:

public class MissingNumber {
    public static void missingNumber(int[] arr, int N) {

        for (int i = 1; i < N; i++) {
            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }

            }
            if (!found) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6};
        missingNumber(arr, 6);
    }
}


