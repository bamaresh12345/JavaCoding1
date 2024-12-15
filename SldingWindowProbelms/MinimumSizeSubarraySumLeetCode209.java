package SldingWindowProbelms;

public class MinimumSizeSubarraySumLeetCode209 {

    public static int minimumSizeSubarraySum(int target, int[] nums) {
        int len = Integer.MAX_VALUE;
        int left = 0;
        // int right = 0;
        int n = nums.length;
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {


            sum = sum + nums[right];

            while (sum >= target) {
                len = Math.min(len, right - left + 1);
                sum = sum - nums[left++];
            }


        }
        return (len == Integer.MAX_VALUE) ? 0 : len;
    }


    public static void main(String[] args) {

        int min = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        System.out.println(min);
        System.out.println(min1);

        int[] nums = {2, 3, 1, 2, 4, 3}; //2
        int target = 7;
        System.out.println("**********ANS************");
        System.out.println(minimumSizeSubarraySum(target, nums));
    }
}
