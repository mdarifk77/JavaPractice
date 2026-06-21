public class LinearSearch {
    public static void main(String[] args) {

        int [] arr = {3,4,2,5,6,7,9};
        int n = arr.length;
        int num = 4;
        int index = -1;

        for (int i=0; i<n; i++){
            if ( arr[i] == num){
                index = i;
                break;

            }
        }
        System.out.println(index);
    }

}
