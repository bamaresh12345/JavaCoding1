package Numbers;

public class missingNumberLeetCode268 {

    public static int missingNumber(int[] nums)
    {
        int n = nums.length;
        int    sum = (n * (n +1))/2;
       
        for (int i = 0; i < nums.length; i++) {

            sum = sum -nums[i];
        }

        System.out.println("missing number : " +sum);

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
}
