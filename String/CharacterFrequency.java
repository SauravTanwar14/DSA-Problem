package String;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

    public static Map<Character,Integer> countFrequency(String str){
        
        Map<Character,Integer> frequency = new HashMap<>();

        for(char c: str.toCharArray()){
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        return frequency;
    }

    //count frequency of string without hashmap

    static void countFreq(String str){
        int count[] = new int[26];

        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);

            if((int)c>=97){
                count[c-'a']+=1;
            }else{
                count[c-'A']+=1;
            }
            
        }

        for(int i=0;i<count.length;i++){
            if (count[i]>0) {
                System.out.println((char)(i+'a')+" -> "+count[i]);
            }
        }
    }

    public static void main(String[] args) {
        
        String str = "helloworld";
        Map<Character, Integer> frequencyMap = countFrequency(str);
        System.out.println("Character Frequencies: " + frequencyMap);

        countFreq(str);
    }

}
