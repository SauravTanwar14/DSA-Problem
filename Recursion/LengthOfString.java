package Recursion;

public class LengthOfString {

    public static int findLength(String str){

        if(str.equals(" ")){
            return 0;
        }

         return 1 + findLength(str.substring(1));
    }

}
