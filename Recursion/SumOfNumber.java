package Recursion;

public class SumOfNumber {

    static int sum(int n){
        if(n==0){
            return 0;
        }
        
        
            int l= n%10;
            int r= sum(n/10);
            int ans = l+r;
        
        return ans;
    }
    public static void main(String[] args) {
        int n=5456;

        System.out.println("Total sum "+sum(n));
    }
}
