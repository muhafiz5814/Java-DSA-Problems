package _04_Arrays;

import java.util.Arrays;

public class ArrayFromPermutation {
    public static void main(String[] args) {

        int[] nums = {1, 3, 0, 2, 6, 4, 5};
        System.out.println(Arrays.toString(nums));
        int[] arr = buildArray(nums);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
