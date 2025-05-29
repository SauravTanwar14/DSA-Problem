package Recursion;

public class SumDigit {

    public static int sumOfDigit(int n){

        if(n<=0){
            return 0;
        }

        return sumOfDigit(n / 10) + n % 10;
    }

    public static int sumOfDigitTree(int n){
        if(n%10==n){
            return n;
        }

        int l = n%10;
        int r= sumOfDigitTree(n/10);
        int ans = l+r;

        return ans;
    }

    public static void main(String[] args) {
        
        int n =123;

        System.out.println(sumOfDigit(n));

        System.out.println(sumOfDigitTree(n));
    }

}

