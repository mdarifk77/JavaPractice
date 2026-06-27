
// Brute Force solution:

//public class MissingNumber {
//    public static int missingNumber( int [] arr, int N){
//
//        for (int i = 1; i<N; i++){
//            boolean found = false;
//
//            for( int j =0; j<arr.length; j++){
//                if(arr[j] == i ) {
//                    found = true;
//                    break;
//                }
//
//            }
//            if( !found){
//                return i;
//            }
//        }
//        return -1;
//    }

//

// Better Solution:

public class MissingNumber{
    public static int missingNumber(int [] arr, int N){
        int [] hash = new int[N+1];

        for( int i = 0; i<arr.length; i++){
            hash[arr[i]] = 1;
        }
        for ( int i = 1; i<=N; i++){
            if (hash[i] == 0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,4,5};
        System.out.println(missingNumber(arr,5));
    }
}


