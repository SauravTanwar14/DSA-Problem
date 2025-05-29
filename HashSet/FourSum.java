package HashSet;

import java.util.*;

public class FourSum {

    //first approach using brute force
    public static List<List<Integer>> fourSumBruteForce(int arr[],int target){

        List<List<Integer>> res = new ArrayList<>();

        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++)
                    {
                        if(arr[i]+arr[j]+arr[k]+arr[l]==target){
                            List<Integer> curr = new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[k],arr[l]));
                            Collections.sort(curr);

                           if(!res.contains(curr)){
                            res.add(curr);
                           }
                           
                        }
                    }
                }
            }
        }
        return res;
        
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 4, 5, 7, 8};
        int target = 23;
        List<List<Integer>> ans = fourSumBruteForce(arr, target);
        // 
        System.out.println(ans);
    }
}
