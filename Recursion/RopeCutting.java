
package Recursion;

public class RopeCutting {

    public static int maxRopeCutting(int n, int a ,int b,int c){

        if(n==0){
            return 0;
        }

        if(n<1){
            return -1;
        }

        int res = Math.max(maxRopeCutting(n-a,  a , b, c),
        Math.max(maxRopeCutting( n-b,  a , b, c),maxRopeCutting( n-c,  a , b, c)));

        if(res==-1)
        return -1;

        return res+1;
    }

    public static void main(String[] args) {
        int n = 23 ;
        int a =11, b=9, c=12;

        int result= maxRopeCutting(n, a, b, c);

        System.out.println("result is  "+result);
    }

}
