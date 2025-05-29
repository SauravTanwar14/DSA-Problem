package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLastOccurrenceElement {

    public static int[] firstLastOccurence(String s, char ele,int first,int last,int index){

        if(index==s.length()){
            return new int [] {first,last};
        }

        char ch = s.charAt(index);
        if(ch==ele){

            if(first == -1){
                first = index;
                last=index;
            }else{
                last = index;
            }
        }

        return firstLastOccurence(s, ele, first, last, index+1);
    }

    public static void main(String[] args) {
        String s="abbbabccdedajgkkr";

        int l = s.length();


        int[] result = new int[l];

        result = firstLastOccurence(s, 'a', -1, -1, 0);
        System.out.println(Arrays.toString(result));
    }

}
