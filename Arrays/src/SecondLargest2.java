public class SecondLargest2 {
    public static void main(String[] args) {

        int [] arr = {1 , 3 , 2 , 4 , 5 , 5 , 4 , 1};
        int Largest = arr[0];

        for (int i = 0; i < arr.length; i++){
            if ( arr[i] > Largest ){
                Largest = arr[i];
            }
        }
        int SecondLargest = Integer.MIN_VALUE;
        for ( int i= 0; i<arr.length; i++){
            if ( arr[i] > SecondLargest && arr[i] != Largest ){
                SecondLargest = arr[i];
            }
        }
        System.out.println("Second Largest Number " +SecondLargest);
    }
}
