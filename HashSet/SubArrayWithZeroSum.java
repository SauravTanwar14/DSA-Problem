package HashSet;

import java.util.HashSet;

public class SubArrayWithZeroSum {

    public static boolean hasZeroSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum =0;

        for(int num : nums){
            sum +=num;

            if(sum == 0 || set.contains(sum)){
                return true;
            }else{
                set.add(sum);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, -3, 1, 6};

        System.out.println(hasZeroSum(arr));
    }
}
