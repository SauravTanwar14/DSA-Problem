package Recursion;

public class FiboncciNthTerm {

    public static int fib(int n){

        if(n==0 || n==1){
            return n;
        }

        int l = fib(n-1);
        int r= fib(n-2);

        int ans = l+r;

        return ans;
    }
    public static void main(String[] args) {
        
        int n=6;

        int result = fib(n);
        System.out.println("result "+result);
    }
}
