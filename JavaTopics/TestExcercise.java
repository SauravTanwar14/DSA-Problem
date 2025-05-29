
//

import java.util.Arrays;
import java.util.HashMap;

public class TestExcercise {

    
    public static void main(String[] args) {
        
        int arr[] ={1,2,4,5,6,10};
        int k =20;

        HashMap<Integer,Integer> map = new HashMap<>();


        for(int num: arr){

            int res = k/num;

            if(map.containsKey(res)){
                System.out.println(num+" "+res);
            }

            map.put(num, 1);

        }
       
    }
}
