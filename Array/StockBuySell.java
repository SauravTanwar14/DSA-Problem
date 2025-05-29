package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class StockBuySell {

    //navie solution
    static int maxProfit(int arr[],int start,int end){

        if(end<=start){
            return 0;
        }

        int profit =0;

        for(int i=start;i<end;i++){
            for(int j=i+1;j<=end;j++){

                if(arr[j]>arr[i]){

                    int curr_profit=arr[j]-arr[i]+maxProfit(arr, start, i-1)+
                    maxProfit(arr, j+1, end);

                    profit = Math.max(profit, curr_profit);

                }
               
            }
        }
        return profit;

    }

    //eficient sloution
    static ArrayList<ArrayList<Integer>> max_Profit(int price[],int n){

        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i=1;i<n;i++){

            if(price[i]>price[i-1]){

                ans.add(new ArrayList<>(Arrays.asList(i-1,i)));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,3,8,12};
        int start =0;
        int end = arr.length;

        ///System.out.println("profit "+ max_Profit(arr, end));
        System.out.println("profit "+ max_Profit(arr, end));

}
}
