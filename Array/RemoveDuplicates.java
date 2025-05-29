package Array;
import java.util.*;

//Given an integer array nums of length n where all the integers of nums are in the range [1, n] and
// each integer appears once or twice, return sorted an array of all the integers that appears twice.
public class RemoveDuplicates {

    static List<Integer> findDuplicates(List<Integer> arr){

        List<Integer> result = new ArrayList<>();

        //simple array method
        for(int i=0;i<arr.size();i++){
            int index= Math.abs(arr.get(i))-1;

            if(arr.get(index)<0){

                result.add(Math.abs(arr.get(i))-1);
            }else{
                arr.set(index, -arr.get(index));
            }
        }
       Collections.sort(result);
        return result;
    }

    //

    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(4 ,3, 2 ,7, 8 ,2, 3, 1);

        List<Integer> result = findDuplicates(list);

        System.out.println(result.toString());
    }
}
