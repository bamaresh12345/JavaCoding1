package ArraysLeetCodeFinal.DuplicateArraysLeetCodeFinal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 442 Find All Duplicates In Array
https://www.youtube.com/watch?v=mY7Kqmphl24 , only brute force and sets dont try another method
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and
 each integer appears  at most twice, return an array of all the integers that appears twice.
You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding
the space needed  to store the output
Example 1: Input: nums = [4,3,2,7,8,2,3,1] Output: [2,3]

Example 2: Input: nums = [1,1,2] Output: [1]
Example 3:Input: nums = [1] Output: []
 */
public class FindAllDuplicatesInArray442LeetcodeMedium {

    public static List<Integer> findAllDuplicatesInArrayBruteForce(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    list.add(nums[j]);
                }
            }
        }

        return list;

    }

    public static void main(String[] args) {

        int nums[] = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findAllDuplicatesInArrayBruteForce(nums));
        System.out.println(findAllDuplicatesInArraySets(nums));

    }


    public static List<Integer> findAllDuplicatesInArraySets(int[] nums) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {

            if (!set.add(nums[i])) { //*If the value is Unique it will be added to set and list.add(nums[i]) is not executed
                list.add(nums[i]);
            }
        }

        return list;


    }
}
