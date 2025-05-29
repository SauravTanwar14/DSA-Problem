package String;

public class Anagram {

    static final int Char=256;

    public static boolean isAnagram(String str1,String str2){

        int n= str1.length();
        int m=str2.length();

        if(n!=m)
        return false;

       int count[]= new int[Char];

       for(int i=0;i<n;i++){
        count[str1.charAt(i)]++;
        count[str2.charAt(i)]--;
       }

     for(int i=0;i<Char;i++){
        if(count[i]!=0){
            return false;
           }
     }
     return true;
     
    }

    public static boolean areAnagrams(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        
        if(n!=m)
        return false;
        int[] count = new int[26];
        
        for(int i=0;i<n;i++){
            count[str1.charAt(i)-'a']++;
            
        }
        
         for(int i=0;i<m;i++){
            count[str2.charAt(i)-'a']--;
            
        }
        
        for(int charcount : count){
            
            if(charcount !=0){
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";

        boolean result = isAnagram(s1, s2);

        if(result==true){
            System.out.println("strings are anagram");
        }
        else{
            System.out.println("strings are not anagram");
        }
    }

}
