//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class LargestElement1 {
    public static void main(String[] args) {

        int [] arr = {2,4,3,5,6,8};
        int max = arr[0];


        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];

            }
        }
            System.out.println("Maximum Element " + max);
    }
}