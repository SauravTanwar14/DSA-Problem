package Recursion;

public class PowerOfNumber {

    static int power(int a,int b){
        if(a==1 || b==0){
            return 1;
        }

        return a*power(a,b-1);
    }

    public static void main(String[] args) {
        
        int a=10;
        int b=2;

        System.out.println("result "+power(a, b));
    }
}
