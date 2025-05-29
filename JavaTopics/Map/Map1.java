package Map;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

   

    public static void main(String[] args){

        Map<String,Integer> m = new HashMap<String,Integer>();

        m.put("1",100);
        m.put("2",200);
        m.put("3", 300);
        m.put("4", 400);

        for (Map.Entry<String,Integer> me : m.entrySet()) {
            
            System.out.print(me.getKey()+":");
            System.out.print(me.getValue()+" ");
        }
    }

    
}
