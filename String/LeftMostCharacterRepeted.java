package String;

import java.util.Arrays;

//naive approach
public class LeftMostCharacterRepeted {

    public static int leftmostNaive(String str){
        char ch = str.charAt(0);

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){

                if(str.charAt(i)==str.charAt(j)){
                    return i;
                }
            }
        }

        return -1;
    }

    //approach using frequency array - we track the frequency of character in array
    public static void frequencyArray(String str){

        int [] frequency =new int[256];

        for(int i=0;i<str.length();i++){
            frequency[str.charAt(i)]++;
        }

         // Find the leftmost repeating character
         for(int i=0;i<str.charAt(i);i++){
            if(frequency[str.charAt(i)]>1){
                System.out.println("The leftmost repeating character is: " + str.charAt(i));
                return;
            }
         }
         System.out.println("No repeating characters found.");

    }

    //Approach 2: Using Index Array
     //Instead of counting frequency, track the first occurrence index of each character.
     public static void indexArray(String str){
        int [] firstIndex = new int[256];

        Arrays.fill(firstIndex, -1); // Initialize all elements to -1

        int leftmostIndex = Integer.MAX_VALUE;

        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);

            if(firstIndex[ch]==-1){
                firstIndex[ch]=i;
            }else{
                leftmostIndex = Math.min(firstIndex[ch], leftmostIndex);
            }
        }
        if (leftmostIndex == Integer.MAX_VALUE) {
            System.out.println("No repeating characters found.");
        } else {
            System.out.println("The leftmost repeating character is: " + str.charAt(leftmostIndex));
        }
     }

    public static void main(String[] args) {
        
        String str = "gabbccabbacc";

    System.out.println("First left most repeating character "+ leftmostNaive(str));

    frequencyArray(str);

    indexArray(str);
    }
}
