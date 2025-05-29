package HashSet;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int nums[]){
        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();

        //adding all the array elements in HashSet
        for(int num:nums){
            set.add(num);
        }

        int longest_Streak=0;

         // Iterate through each number in the array
        for(int num:nums){

             // Check if it's the start of a sequence
            if(!set.contains(num-1)){

                int currentNum= num;
                int current_Streak =1;

                 // Count the length of the consecutive sequence
                 while(set.contains(currentNum + 1)){

                    currentNum++;
                    current_Streak++;
                 }
                 // Update the longest streak
                longest_Streak = Math.max(longest_Streak, current_Streak);
            }
        }

        return longest_Streak;
    }
    public static void main(String[] args) {
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(nums1));  // Output: 4

        int[] nums2 = {0, 1, 2, 3, 4, 5, 6};
        System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(nums2));  // Output: 7

        int[] nums3 = {1, 9, 3, 10, 4, 20, 2};
        System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(nums3));  // Output: 4
    }
}
