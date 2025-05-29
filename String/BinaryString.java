package String;

//Given a binary string S. The task is to count the number of substrings that start and end with 1

public class BinaryString {

    //navie solution
    public static int countSubString(char str[],int n){

        int count =0;

        for(int i=0; i<n ;i++){

            if(str[i] == '1')
            for(int j=i+1; j<n ;j++){

                if(str[j]=='1')
                count++;

            }
           

        }
        return count;
    }

    //efficent
    //navie solution
    public static int countSubString1(char str[],int n){

        int count =0;

        for(int i=0; i<n ;i++){

            if(str[i] == '1')
            count++;
         
           

        }
        return count*(count-1)/2;
    }

    public static void main(String[] args) {
       
        String string = "00100101";
        char str[] = string.toCharArray();
        int n = str.length;
        System.out.println(" "+countSubString1(str, n));
    }

}
