package String;

public class FirstNonRepeatedCharacter {

    public static char firstNonRepeatedCharacter(String str){

        for(int i=0 ; i<str.length();i++){

            boolean isRepeated= false;
            
            for(int j=0;j<str.length();j++){

                if(i != j && str.charAt(i)==str.charAt(j)){
                    isRepeated =true;
                    break;
                }
            }

            if(!isRepeated){
                return str.charAt(i);
            }
        }
        return '\0';
    }

    public static char uniqueCharacter(String s){
        int[] a = new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i) - 'a']++;
        }

        for(int i=0;i<s.length();i++){
            if(a[s.charAt(i) - 'a'] == 1)
                return s.charAt(i);
        }

        return '\0';
    }

    public static void main(String[] args) {
        
        String str= "swiss";

        char chr = firstNonRepeatedCharacter(str);

        if (chr != '\0') {
            System.out.println("The first non-repeated character is: " + chr);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }


}
