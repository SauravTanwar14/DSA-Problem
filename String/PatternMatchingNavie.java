package String;

public class PatternMatchingNavie {

    static void patternMatching(String str,String pat){
        int n= str.length();
        int m = pat.length();

        for(int i =0 ;i<=n-m ;i++){
            int j;

            for(j = 0 ;j<m ;j++){
                if(pat.charAt(j) != str.charAt(i+j)){
                    break;
                }
            }
                
                if(j==m){
                    System.out.print(i+" ");
                }
            
        }


    }

    public static void main(String args[]) 
        {   String txt = "ABCABCD";String pat="ABCD";
            System.out.print("All index numbers where pattern found: ");
            patternMatching(txt,pat);  
        } 

}
