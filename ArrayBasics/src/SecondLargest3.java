public class SecondLargest3 {
    public static void main(String[] args) {
        int [] arr = { 1,3,5,2,6,3,4,6 };

        int Largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){

            if ( arr[i] > Largest){
                SecondLargest = Largest;
                Largest = arr[i];

            }
            else if( arr[i] > SecondLargest && arr[i] != Largest){
                SecondLargest = arr[i];
            }
        }
        System.out.println("Second Largest Number " +SecondLargest );

    }
}
