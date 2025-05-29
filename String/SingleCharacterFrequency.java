package String;

public class SingleCharacterFrequency {
public static int countFrequency(String str,char ch){

    int count=0;

   for(int i=0;i<str.length();i++){
    if(str.charAt(i)==ch){
        count++;
    }
   }
   return count;
}
public static void main(String[] args) {
    String str="Hello,World";
    char ch='l';
    int count = countFrequency(str, ch);
    System.out.println(" count "+count);
}
    
}
