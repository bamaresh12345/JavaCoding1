package ArraysLeetCodeFinal.DuplicateArrays;
/* https://www.youtube.com/watch?v=BLFvXsBf5uM
26. 80. Remove Duplicates from Sorted Array II
Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique elemen
t appears at most twice. The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in some languages, you must instead have the result be placed
in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the
 first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Example 1:
Input: nums = [1,1,1,2,2,3]  Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Return k after placing the final result in the first k slots of nums.

 */

public class RemoveDuplicatesFromSortedArray11Medium {

    /*
       0. declare valruiave i=0 , to store the index of array without 2 duplicate elements
       1. run for each loop till end of array n : nums
       2. check if the ith i< 2 or  n !=nums[i-2] then
       3. update nums[i] = n
       4  and increment i++
       5. continue till end the array
       6. finallay return ith index which stores the total unique elements
     */

    public static int removeSuplicatesFromSortedArrayII(int[] nums) {

        int i = 0;   // two pinter concept
        for (int n : nums) {
            {
                if (i < 2 || n != nums[i - 2]) {
                    nums[i] = n;
                    i++;
                }
            }


        }
        return i;
    }

    public static void main(String[] args) {


        int[] nums = {1, 1, 2, 2, 3, 2, 3, 3}; //5
        // int[] nums = {0, 0, 0, 0, 1, 1, 1, 2, 2, 3}; //5
        // int[] nums = {0, 0, 1, 1, 2, 2, 3, 2, 2, 3}; //5

        System.out.println(removeSuplicatesFromSortedArrayII(nums));

    }


}
