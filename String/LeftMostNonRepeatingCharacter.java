package String;

import LinkedList.Traverse;

public class LeftMostNonRepeatingCharacter {

    //approach naive solution
    public static int naiveSolution(String str){

        for(int i=0;i<str.length();i++){
            boolean flag = false;

            for(int j=0;j<str.length();j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    flag=true;
                    break;
                }
            
            }

            if(flag==false)
            return i;
        }
        return -1;
    }

// Traverse the string to count the frequency of each character.
// Use an array or map to store the frequency of characters.
// Traverse the string again to find the first character with a frequency of 1.
// The first such character is the leftmost non-repeating character.
public static int betterApproach(String str){
    int[] frequency = new int[256];

    for(int i=0;i<str.length();i++){
        frequency[str.charAt(i)]++;
    }

    for(int i=0;i<str.length();i++){
        if(frequency[str.charAt(i)]==1)
        return i;
    }

    return -1;
}
    public static void main(String[] args) {
        String str = "geeksforgeeks";

        System.out.println("leftmost non repating character "+naiveSolution(str));
        System.out.println("leftmost non repating character "+betterApproach(str));
    }
}
