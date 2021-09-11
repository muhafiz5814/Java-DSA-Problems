package _04_Arrays;

import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        int[] ans = getConcatenate(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] getConcatenate(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i = 0; i < n; i++) {
            ans[i] = ans[i+n] = nums[i];
        }
        return ans;
    }
}
