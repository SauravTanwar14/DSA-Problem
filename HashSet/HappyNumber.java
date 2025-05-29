package HashSet;

import java.util.HashSet;

public class HappyNumber {

    // approach using Hashset
    public static boolean happyNumber(int num) {

        HashSet<Integer> hashSet = new HashSet<>();

        while (!hashSet.contains(num)) {
            hashSet.add(num);

            num = sumOfSquare(num);

            if(num==1){
                return true;
            }
        }
        return false;
    }

    private static int sumOfSquare(int num) {

        int sum = 0;
        int rem = 0;
        while (num > 0) {
            rem = num / 10;
            sum += rem * rem;

            num = num / 10;
        }
        return sum;
    }

    //approach using Floyd Warshell Algorithm
    public static boolean happyNumberUsingFloyd(int num){
        int slow = num;
        int fast = num;

        do{
            slow = sumOfSquare(slow);
            fast = sumOfSquare(sumOfSquare(fast));
        }while(slow!=fast);

        return slow == 1;
    }

    public static void main(String[] args) {
        
        int n= 4;

        //using hashset
        boolean result = happyNumber(n);

        if(result){

            System.out.println("happy number");
        }
        else{
            System.out.println("not happy number");
        }

        int num = 4;
        
        if(happyNumberUsingFloyd(num)){

            System.out.println("happy number");
        }
        else{
            System.out.println("not happy number");
        }
        

    }
}
