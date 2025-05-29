package Hashing;

import java.util.HashMap;

public class OccurrenceOfCharInString {

    public static void charactercount(String str){
        HashMap<Character,Integer> count = new HashMap<>();

        

        // for(char c :str.toCharArray()){

        //     if(count.containsKey(c)){
        //         count.put(c,  count.getOrDefault(c, 0)+1);
        //     }
        //     else
        //     count.put(c, 1);
        // }

        for(char c :str.toCharArray()){

                count.put(c,  count.getOrDefault(c, 0)+1);
            
        }

        count.forEach((character, countChar) ->
        System.out.println("Character: " + character + ", Count: " + countChar));
}
    }

