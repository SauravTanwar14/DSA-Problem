package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToString {

    public static void main(String[] args) {
        
        String array[]={"Java","Python","PHP","C++"};
        
        System.out.println("Printing Array"+Arrays.toString(array));

        List<String> list = new ArrayList<>();

        for (String string :array) {
            
            list.add(string);
        }
        System.out.println(list);
    }
}
