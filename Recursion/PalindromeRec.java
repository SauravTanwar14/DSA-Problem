package Recursion;

public class PalindromeRec {

    public static boolean checkPalindrome(String str, int start,int end){

        if(start >= end){
            return true;
        }

      return (str.charAt(start) == str.charAt(end) && checkPalindrome(str, start+1, end-1)) ;  
    }

    public static void main(String[] args) {
        
        String str = "abbad";

        int start = 0;
        int end = str.length()-1;

        boolean result = checkPalindrome(str, start, end);

        if(result ==true){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }

}
