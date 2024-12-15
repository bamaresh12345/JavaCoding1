package ArraysLeetCodeFinalMedium;

import java.util.Arrays;

public class RotateArrayLeetCode189Medium {

    /*
       1. reverese array from 0 to n-1
       2. reverse array from 0, k-1
       3. reverse array from k to n-1;

       4. to reverse array write method which takes nums, start and end paramters
       5. while start < end
       6. check if start array < end array swap the array values
       7. finally retun array

     */

    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        reverseArray(nums, 0, n - 1);
        System.out.println(Arrays.toString(nums));
        reverseArray(nums, 0, k - 1);
        System.out.println(Arrays.toString(nums));
        reverseArray(nums, k, n - 1);
        System.out.println(Arrays.toString(nums));

        // return nums;

    }

    public static void reverseArray(int[] nums, int start, int end) {
        while (start < end) {  // VERY IMP****
            // DONT USE ANY IF LOOP**** // here JSUT SWAPPING NOT CHECK VALUES with IF Statement
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;  // VERY IMP
            end--;   // VERY IMP

        }

    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateArray(nums, k);
    }


}