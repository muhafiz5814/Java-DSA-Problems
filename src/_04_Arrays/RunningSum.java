package _04_Arrays;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1, 25, 3, 44};

        int[] res = runningSum(nums);
        System.out.println(Arrays.toString(res));
    }

    static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i<nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}
