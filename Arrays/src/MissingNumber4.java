// Optimal Approach xor method:

public class MissingNumber4 {
    public static int missingNumber(int [] arr , int N){

        int xor1 = 0;
        int xor2 = 0;

        for (int i = 1; i <= N; i++){
            xor1 ^= i;
        }
        for (int j = 0; j < arr.length; j++){
            xor2 ^= arr[j];
        }
        return xor1 ^ xor2 ;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6};
        System.out.println(missingNumber(arr,6));
    }
}
