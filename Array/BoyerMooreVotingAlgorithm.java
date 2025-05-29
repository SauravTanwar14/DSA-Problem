package Array;

import java.util.ArrayList;
import java.util.List;

public class BoyerMooreVotingAlgorithm {

     public List<Integer> majorityElement(int[] nums){
        List<Integer> result = new ArrayList<>();

        if(nums == null || nums.length==0){

            return result;
        }

        int candidate1= Integer.MIN_VALUE;
        int candidate2=Integer.MIN_VALUE;

        int count1=0;
        int count2=0;

        for(int num:nums){

            if(candidate1==num){
                count1++;
            }else if(candidate2==num){
                count2++;
            } else if(count1==0){
                candidate1=num;
                count1 =1;
            }else if(count2==0){
                candidate2 = num;
                count2 = 1;
            } else{
                count1--;
                count2--;
            }
        }
        // Step 2: Verify the candidates by counting their actual occurrences
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        // Step 3: Add to result if they appear more than N/3 times
        int threshold = nums.length / 3;
        if (count1 > threshold) {
            result.add(candidate1);
        }
        if (count2 > threshold) {
            result.add(candidate2);
        }

        return result;
     }

     public static void main(String[] args) {
        BoyerMooreVotingAlgorithm solution = new BoyerMooreVotingAlgorithm();
        
        int[] nums = {3, 2, 3};
        List<Integer> result = solution.majorityElement(nums);
        System.out.println(result);  // Output: [3]

        nums = new int[]{2,1,5,5,6,6};
        result = solution.majorityElement(nums);
        System.out.println(result);  // Output: [1, 2]
    }
}
