package Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LongestSubsquenceArray {
    

    public static int longestSubsquenceArray(int arr[]){

        int n= arr.length;

        Arrays.sort(arr);

        int answere =0;
        int conescutive =0;

        ArrayList<Integer> dist = new ArrayList<Integer>();
        dist.add(arr[0]);

        //inserted repeated number one by one in arraylist
        for(int i =1;i<n;i++){
            if(arr[i] != arr[i-1]){
                dist.add(arr[i]);
            }
        }

        //finding the largest consecutive subsequence array by iterating
        for(int i =0;i<dist.size();i++){

            if(i>0 && dist.get(i) == dist.get(i-1)+1){
                conescutive++;
            }
            else{
                conescutive =1;
            }

            answere = Math.max(answere, conescutive);
        }

        return answere;
        

    }

    public static void main(String[] args) {
       // int arr[]={11,39,13,10,14,20,12,15};
       int arr[] ={0, 1 ,1, 1 ,1 ,1 ,2};

        System.out.println("Longest conescutive subsequence in array is : "+longestSubsquenceArray(arr));
    }
}
