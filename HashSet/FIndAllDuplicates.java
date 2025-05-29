package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FIndAllDuplicates {

    public static List<Integer> findDuplicates(int arr[]){

        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<Integer>() ;

        for(int num : arr){

            if(set.contains(num)){
                result.add(num);
            }
            set.add(num);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};

        List<Integer> result = findDuplicates(arr);

        System.out.println(result);


    }
}
