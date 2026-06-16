public class SortedArray {
    public static boolean Sorted (int [] args) {

        int [] arr = {1,3,2,4,3,2,5,6};
        int [] arr1 = {1,2,3,4,5,6};

        for(int i = 0; i< arr.length - 1; i++ ) {
            if(arr[i] >= arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,2,4,3,2,5,6};
        System.out.println(Sorted(arr));
    }

}
