import java.util.*;
class Hashing {

    public static void hashing(int[] arr, int[] queries) {

        // Precompute
        int[] hash = new int[13];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        // Fetch
        for (int i = 0; i < queries.length; i++) {
            int number = queries[i];

            System.out.println(hash[number]);
        }
    }
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 1, 3};

        int[] queries = {1, 4, 2, 3, 12};

        Hashing.hashing(arr, queries);
    }
}
