import java.util.ArrayList;
import java.util.Arrays;

public class MaxNumOfKPairs {
    public static int maxNumOfOperation(int nums[], int k){
        Arrays.sort(nums);
        int lp = 0,  rp = nums.length-1;
        int count = 0;
        while (lp < rp) {
            int sum = nums[lp] + nums[rp];
            if (sum == k) {
                count++;
                lp++;
                rp--;
            }else if (sum < k) {
                lp++;
            }else{
                rp++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums1[] = {1,2,3,4};
        int k = 5;
        System.out.println(maxNumOfOperation(nums1, k));
    }
}