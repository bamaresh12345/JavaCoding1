package ArraysLeetCodeFinalMedium;
/* https://www.youtube.com/watch?v=BLFvXsBf5uM
26. 80. Remove Duplicates from Sorted Array II (USE MY HASHMAP SOLUTIONS NOT WORK PROPERLY)
Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique
 element appears at most twice. The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in some languages, you must instead have the result be
 placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates,
 then the  first k elements of nums should hold the final result. It does not matter what you leave beyond the
  first k elements.

Example 1:
Input: nums = [1,1,1,2,2,3]  Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Return k after placing the final result in the first k slots of nums.

Input: nums = [0,0,1,1,1,1,2,3,3] Output: 7, nums = [0,0,1,1,2,3,3,_,_]

 */

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedArray11Leetcode80 {

    public static int removeDuplicatesFromSortedArrayII(int[] nums) {
        /* USE TWO POINTERS Left and Right

        1. get the length of array n = nums.length
        2. check if n<3 then return n;
        3. declare left=2, and right=2 very IMP***
        4. run while loop till right < n length of array
        5. check if nums[right]!= nums[left-2] ***
        6. if yes assign nums[left++] = nums[right]; (cant incemrnt right here)
        7. end incrment right++
        8. finally retun left ,which contains remaing unique elements

         */
//=================GOOD ONE============================================
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n != nums[i - 2]) {
                nums[i] = n;
                i++;
            }

        }

        return i;
        //==================================================
    }

    public static void main(String[] args) {


        int[] nums = {1, 1, 1, 2, 2, 3}; //5
        // int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3}; //7

        System.out.println(removeDuplicatesFromSortedArrayII(nums));

        int[] nums1 = {1, 1, 1, 2, 2, 3}; //5
        // int[] nums1 = {0, 0, 1, 1, 1, 1, 2, 3, 3}; //7
        System.out.println(removeDuplicatesFromSortedArrayIIHashMap(nums1));


    }

    public static int removeDuplicatesFromSortedArrayIIHashMap(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {

                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        System.out.println(map);
        int count = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                count = count + 2;

            } else if (entry.getValue() == 1) {
                count++;
            }

        }
        System.out.println("Count from HashMap ==> : " + count);
        return count;
    }


}
