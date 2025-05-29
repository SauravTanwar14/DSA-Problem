package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntersectionPointUnsortedArray {

    public static List<Integer> intersection(int[] nums1, int[] nums2) {
        //storing intersection in a list
        List<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums1){
            set.add(num);
        }

        for(int num : nums2){
            if(set.contains(num)){
                result.add(num);
               // set.remove(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {10,15,20,25,30,35,50};
        int[] nums2 = {30,5,15,80};
        List<Integer> result = intersection(nums1, nums2);
        System.out.println(result);
    }
}
