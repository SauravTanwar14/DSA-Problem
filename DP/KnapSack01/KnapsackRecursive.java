package DP.KnapSack01;

public class KnapsackRecursive {
    public static int knapsack(int weight[], int value[], int n, int w) {
        if(n==0 || w==0)
            return 0;

       if(weight[n-1]<=w){
           int incl = value[n-1]+knapsack(weight,value,n-1,w-weight[n-1]);
           int excl = knapsack(weight,value,n-1,w);

           int ans = Math.max(incl,excl);

           return ans;
       }
       else {
           int excl = knapsack(weight,value,n-1,w);
           return excl;
       }
    }

    public static void main(String[] args) {
        int[] weights = {2, 3, 4};
        int[] values = {4, 5, 6};
        int W = 5;
        System.out.println("Max Value: " + knapsack(weights, values, weights.length,W));
    }
}
