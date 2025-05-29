package Stream_API;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

interface Lambdaoperation{

    int operation(int a,int b);
 
}


public class StreamApiDemo {

    public static int factorial(int n){

        if(n==0){
            return 1;
        }else{

            return n*factorial(n-1);
        }
        
    }

    public static void main(String[] args) {
        
        List<Integer> list1 = List.of(2,4,50,21,22,67);

        System.out.print(list1);

        List<Integer> newList = list1.stream().filter(i->i%2==0).collect(Collectors.toList());

        System.out.print(newList);

        Lambdaoperation addition = (int a,int b) -> a+b;

       // int result = addition.operation(5, 3);

       int result = factorial(5);
        System.out.println("Result: " + result); 

        String s1="Hello";
        String s2="Hello";
        String s3= new String("Hello");

        if(s1==s2){
            System.out.println("true");
        }else
        System.out.println("false");


        if(s1==s3){
            System.out.println("true");
        }else
        System.out.println("false");

        if(s1.equals(s3)){
            System.out.println("true");
        }else
        System.out.println("false");
    }

}
