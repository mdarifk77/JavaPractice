
// Brute Force solution:

public class MissingNumber {
    public static int missingNumber(int[] arr, int N) {

        for (int i = 1; i < N; i++) {
            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }

            }
            if (!found) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        System.out.println(missingNumber(arr, 6));
    }
}


