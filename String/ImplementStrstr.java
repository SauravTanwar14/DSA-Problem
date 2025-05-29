package String;

//Your task is to implement the function strstr. 
//The function takes two strings as arguments (s,x) and  locates 
//the occurrence of the string x in the string s. 
//The function returns an integer denoting the first occurrence of the string x in s (0 based indexing).

public class ImplementStrstr {

    public static int isSubsquence(String s, String x){

        if (x.length() == 0){
            return 0;
        } 
        
        //iterating over given string s to search for string x.
        for (int i = 0; i < s.length(); i ++)
        { 
            if (i + x.length() > s.length()){
                return -1;
            }
            
            //checking for string x from current index i in the string s.
            for (int j = 0; j < x.length(); j ++)
            {
                //if any character doesn't match, we break the loop.
                //if string x is found, then we return the starting index.
                if ( s.charAt(i + j) == x.charAt(j) )
                {
                    if (j == (x.length() -1)){
                        return i;
                    }
                }
                else
                    break;
             }
        }
        //returning -1 if string x is not found.
        return -1;
    }
    

    public static void main(String[] args) {
        
        String s = "ababaaaaaa";
        String x = "abaa";

        int result = isSubsquence(s, x);

        
        System.out.println(result);
       

        
    }

}
