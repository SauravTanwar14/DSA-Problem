package Hashing;

import java.util.HashSet;

/*
Store all elements in a HashSet for O(1) lookups

For each number, check if it’s the start of a sequence

Then count how far that sequence goes
*/
public class LongestConsecutiveSubsequence {
    public static int longestSubsequence(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        int longest=0;

        //storing in set
        for(int x : arr){
            set.add(x);
        }

        for(int num : set){
            // Only try to build sequence if num is the start
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }
        return  longest;

    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = longestSubsequence(nums);
        System.out.print(result);
    }

}
