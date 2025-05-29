package Method_Reference;

import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {
        
        String str[] = new String[10];
        //str[5]="Hello, optional";

        // Create an Optional object from the value of str[5].  
        Optional<String> checkNull = Optional.ofNullable(str[5]);  
        // Check if the Optional object contains a value.  

        if(checkNull.isPresent()){
            // Convert the string to lowercase if it's not null.  
            String word = str[5].toLowerCase();  
            System.out.println(word); // Print the lowercase string.  
        }
        else
        System.out.println("string is null"); 


    }
}
