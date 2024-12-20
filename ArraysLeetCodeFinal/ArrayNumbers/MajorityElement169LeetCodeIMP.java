package ArraysLeetCodeFinal.ArrayNumbers;

import java.util.HashMap;
import java.util.Map;
/* 169. Majority Element
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element
 always exists in the array.

Example 1: Input: nums = [3,2,3] Output: 3
Example 2: Input: nums = [2,2,1,1,1,2,2] Output: 2
 */
public class MajorityElement169LeetCodeIMP {

    public static int majorityElementHashMap(int[] nums) {

     Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
         int largestKey=0, largestValue=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {

              if(entry.getValue() > nums.length/2)    //*** IMP
              {
                largestValue = entry.getValue();
                largestKey = entry.getKey();
              }
        }

        return largestKey;

    }

    public static void main(String[] args) {

        int[] nums = new int[] {3,2,3};

        System.out.println(majorityElementHashMap(nums));
        System.out.println(majorityElementMajority(nums));
        System.out.println(majorityElementBruteforce(nums));
    }

    public static int majorityElementMajority(int[] nums) {

        int majorityValue=nums[0], votes=1;

        for(int i=1; i<nums.length;i++)
        {
            if(votes==0)
            {
                votes++;
                majorityValue = nums[i];
            }
            else if(majorityValue == nums[i])
            {

                votes++;

            }
            else

            {
                votes--;
            }

            return majorityValue;
        }
        return -1;
    }




    //Brute force
    public static int majorityElementBruteforce(int[] nums) {

        for(int i=0; i<nums.length;i++)
    {
        for(int j=i+1; j<nums.length;j++)
        {
            int temp = 0;
            if(nums[i] > nums[j])
            {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }
    int majorityelement = nums.length/2; // ***IMP
        return nums[majorityelement];

}
}
