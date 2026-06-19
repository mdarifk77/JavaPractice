import java.util.Arrays;

public class RotateByN {
    public static void reverse ( int [] arr , int start, int end){

        while( start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void leftRotate(int [] arr, int n){
        int len = arr.length;
        n = n%len;
        reverse(arr , 0 , n-1);
        reverse(arr , n , len-1);
        reverse(arr , 0 , len-1);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int n=4;
        leftRotate(arr,n);
        for(int sum : arr){
            System.out.print(sum+ " " );
        }
    }

}
