package Array;

import java.util.HashMap;

public class FirstMissingPositiveInteger {

    public static int missing(int arr[]){

        HashMap<Integer,Boolean> map =new HashMap<>();

        for(int num:arr){
            if(num>0){
                map.put(num,true);
            }
           
        }

        int missing=1;

        while(true){
            if(!map.containsKey(missing)){
                return missing;
            }
            missing++;
        }
    }

    public static void main(String[] args) {
        int arr1[]={3, 4, -1, 1};
        int[] arr2 = {7, 8, 9, 11, 12};

        int result =missing(arr1);
        int result2 =missing(arr2);
        System.out.println("result "+result2);
    }

}
