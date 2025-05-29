package Recursion;

public class Factorial {

    public static int fact(int n){

        if(n==1 || n==0){
            return 1;
        }
        
       return n* fact(n-1);

}

public static int factLR(int n){
    if(n==1 || n==0){
        return 1;
    }

    int r=n;
    int l=factLR(n-1);
    int ans = r*l;

    return ans;
}

public static void main(String[] args) {
    
    int n=5;
  int result =  fact(n);

  int result1 = factLR(n);
  System.out.println(" result "+fact(n));
  System.out.println(" result "+factLR(n));
}
}
