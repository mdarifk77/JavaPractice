
import java.util.Arrays;
public class SecondLargest1 {
    public static void main(String[] args) {
        int [] arr = {2,3,1,4,5,0,5};
        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        int SecondLargest = -1;

        for ( int i = arr.length -2; i >= 0; i--){
            if (arr[i] != largest){
                SecondLargest = arr[i];
                break;
            }
        }
        System.out.println("Second Largest Element " + SecondLargest);
    }
}
