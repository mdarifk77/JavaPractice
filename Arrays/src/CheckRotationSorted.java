// LeetCode 1752 – Check if Array Is Sorted and Rotated:

public class CheckRotationSorted {
    public static boolean checkSorted(int [] nums){
        int n = nums.length;

        for(int k = 0; k < n; k++){
            int [] rotated = new int[n];

            for(int i = 0; i < n; i++){
                rotated[i] = nums[(i + k) % n];
            }
            boolean sorted = true;

            for(int i = 0; i < n-1; i++) {
                if (rotated[i] > rotated[i + 1]) {
                    sorted = false;
                    break;
                }
            }
            if(sorted){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums = {3, 4, 5, 1, 2};
        boolean ans = checkSorted(nums);
        System.out.println(ans);
    }
}
