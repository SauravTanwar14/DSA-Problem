package String;

public class StringPalindrome {

    public static boolean isPalindrome(String str){

        
            if (str == null || str.length() == 0) {
                return true;
            }

            int left=0;
            int right = str.length()-1;

            while(left<right){

                if(str.charAt(left) !=str.charAt(left)){

                    return false;
                }
                left++;
                right--;
            }

            return true;

    }

    public static void main(String[] args) {
        String str="Madam";

        boolean isPalindrome = isPalindrome(str);
        System.out.println("Is the string a palindrome? " + isPalindrome);


    }

}
