import java.util.*;

public class IntersectionArray {
    public static ArrayList<Integer> intersection(int [] a, int [] b){
        int i =0;
        int j =0;
        ArrayList<Integer> ans = new ArrayList<>();

        while(i < a.length && j< b.length){
            if(a[i]<b[j]){
                i++;
            }
            else if(b[j] < a[i]){
                j++;
            }
            else {
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] a = {1,2,2,3,3,4,5,6};
        int [] b = {2,2,3,3,5,6,7};
        System.out.println(intersection(a,b));
    }
}
