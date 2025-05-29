package Hashing;

import java.util.HashMap;

public class LongestSubstringKDistinct {

    public static int  longestSubstringWithKDistinct(String s,int k){
        if (s == null || s.length() == 0 || k == 0) {
            return 0;
        }
        int i=0,j=0,maxLen=0;

        HashMap<Character,Integer> hashMap = new HashMap<>();

        while(j<s.length()){
            hashMap.put(s.charAt(j), hashMap.getOrDefault(s.charAt(j), 0)+1);

            while(hashMap.size()>k){
                int count = hashMap.get(s.charAt(i))-1;

                if(count>0){
                    hashMap.put(s.charAt(i),count);
                }else{
                    hashMap.remove(s.charAt(i));
                }
                i++;
            }
            maxLen = Math.max(maxLen, j-i+1);
            j++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        System.out.println("Longest substring length with at most " + k + " distinct characters: " +
                longestSubstringWithKDistinct(s, k));
    }
}
