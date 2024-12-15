package EricProgrammingTwoPointers;

import java.util.Arrays;

public class MoveZeros283LeetCode {
    public static void moveZeros(int[] nums) {
       /*
         1. inilitze count vairalbe which points to 0th index of array
         2. run for loop till end of array nums
         3. check if array of nums is not equal to zero
         4. using counter pointer update array with nubmer nums[counter++] = nums[i];
         5. finally ru nthe for loop starting from counter till end of nums array length
         6. assign all counter index to zero
        */

        int counter = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[counter++] = nums[i];
            }


        }

        for (int i = counter; i < nums.length; i++) {

            nums[counter++] = 0;
        }

        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeros(nums);

    }

    //can use two pointer also
}
