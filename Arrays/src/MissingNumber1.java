// Better Approach Solution:

public class MissingNumber1{
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


