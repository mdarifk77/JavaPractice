
import java.util.*;
public class UnionSortedArray {
    public static ArrayList <Integer> unionArray(int [] arr1, int [] arr2){
        int i = 0, j=0;
        ArrayList<Integer> union = new ArrayList<>();
        while(i < arr1.length  && j < arr2.length){
            if (arr1[i] <= arr2[j]){
                if (union.isEmpty() || union.getLast() != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }
            else {
                if(union.isEmpty() || union.getLast() != arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while ( i<arr1.length){
            if(union.isEmpty() || union.getLast() != arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }
        while(j<arr2.length){
            if(union.isEmpty() || union.getLast() != arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }
        return union;
    }

    public static void main(String[] args) {
        int [] arr1 = {1,2,2,3,4,5};
        int [] arr2 = {3,4,5,6,7,8};
        System.out.println(unionArray(arr1,arr2));
    }

}
