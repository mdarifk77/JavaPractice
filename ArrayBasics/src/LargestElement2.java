import java.util.Arrays;

public class LargestElement2 {
    public static void main(String[] args) {

        int [] arr = {1,3,2,6,0,3,2};

        Arrays.sort(arr);
        int max = arr[arr.length-1];

        System.out.println("Maximum Element " +max);
    }
}
