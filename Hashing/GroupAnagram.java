package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

    public static ArrayList<ArrayList<String>> groupAnagrams(String strs[]){
        /*Initialize a Global HashMap:
Use globalHashMap to map a frequency hash map (character-to-count map) to a list of strings that share the same frequency map.
Each unique anagram group will have a unique frequency map */

        HashMap<HashMap<Character,Integer>,ArrayList<String>> globalHashMap = new HashMap<>();

        /*Iterate Over Each String:
For each string in the input array strs, calculate its frequency hash map.
The frequency hash map keeps track of how many times each character appears in the string.
 */
        for(String s : strs){
            HashMap<Character,Integer> frequencyHashMap = new HashMap<>();

            for(int i=0;i<s.length();i++){
                frequencyHashMap.put(s.charAt(i),frequencyHashMap.getOrDefault(s.charAt(i),0)+1);
            }

            /*Store Strings in Global HashMap:
If the calculated frequencyHashMap is not already in globalHashMap, create a new entry.
Add the current string (s) to the list corresponding to this frequency map. */

            globalHashMap.putIfAbsent(frequencyHashMap, new ArrayList<>());
            globalHashMap.get(frequencyHashMap).add(s);
        }

        /*Collect Results:
Extract all values (lists of strings) from globalHashMap and store them in an ArrayList<ArrayList<String>>. */
        ArrayList<ArrayList<String>> arrayLists = new ArrayList<>();

        for(ArrayList<String> val : globalHashMap.values()){
            arrayLists.add(val);
        }

        return arrayLists;

    }

    public static void main(String[] args) {
           String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
           ArrayList<ArrayList<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }
}
