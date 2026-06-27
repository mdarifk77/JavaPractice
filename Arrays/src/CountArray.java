import java.util.Arrays;

public class CountArray {
    public static void countArray(int[] arr){
        int zeros = 0;
        int ones = 0;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] == 0){
                zeros++;
            }else {
                ones++;
            }
        }

        System.out.println("Count of zeros " +zeros);
        System.out.println("Count of ones " +ones);
    }

    public static void main(String[] args) {
        int [] arr = {1,0,1,0,0,1,0};
        countArray(arr);

    }
}
