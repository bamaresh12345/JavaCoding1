package ArraysLeetCodeFinal.ArrayNumbers;

/*  487. Max Consecutive Ones II
Input: [1,0,1,1,0] Output: 4
Explanation: Flip the first zero will get the the maximum number of consecutive 1s.
    After flipping, the maximum number of consecutive 1s is 4.
 */
public class MAxConsectiveOnesII {

    public static int maxConsitiveOnesII(int[] nums) {

        int count = 0, maxLen = 0;
        int Left = 0, Right = 0;
        int n = nums.length;

        //find the consitve ones
        while (Right < n) {
            if (nums[Right] == 0) {
                count++;
            }

            //contract window if we dont meet the condition
            while (count > 1) {
                if (nums[Left] == 0) {
                    count--;
                }
                Left++;
            }
            //upddate maxLength
            maxLen = Math.max(maxLen, Right - Left + 1);

            //move the R one to the right
            Right++;
        }

        return maxLen;


    }

    public static void main(String[] args) {

        //int[] nums = {1, 1, 0, 1, 1, 1};
        int[] nums = {1, 0, 1, 1, 0};

        System.out.println(maxConsitiveOnesII(nums));
    }


}
