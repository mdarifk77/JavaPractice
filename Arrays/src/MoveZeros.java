import java.util.Arrays;
public class MoveZeros {
    public static void  moveZeros( int [] arr){

        int j = -1;
        for(int i = 0; i<arr.length; i++){
            if (arr[i]==0){
                j = i;
                break;
            }
        }
        for ( int i = j+1; i<arr.length; i++){
            if (arr[i] != 0){

                // SWAPING OF ARRAY:
                int temp = arr[i];
                arr[i] = arr[j];
                arr [j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,0,2,3,2,0,0,4,5,1};
        moveZeros(arr);

        System.out.println(Arrays.toString(arr));
    }
}

//import java.util.*;
//public class MoveZeros{
//    public static void moveZeros(int [] arr){
//
//        int  temp = 0;
//        for(int i = 0; i<arr.length; i++){
//            if (arr [i] != 0){
//                temp.add(arr[i]);
//            }
//        }
//        for(int i = 0; i<temp.size(); i++){
//            arr[i] = temp[i]
//        }
//    }
//}
