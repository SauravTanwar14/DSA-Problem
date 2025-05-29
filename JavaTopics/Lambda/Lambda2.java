package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

interface Addition{
    int add(int a, int b);
}

public class Lambda2 {

    public static void filter(List<String> names,Predicate<String> condition){
        for(String name : names){
            if(condition.test(name)){
                System.out.println(name+" ");
            }
        }
    }
    public static void main(String[] args) {
        
        Addition ad = (a,b)-> (a+b);

        System.out.println(ad.add(10, 20));

        List<String> languages = Arrays.asList("Java", "Python", "JavaScript", "C++");  
        System.out.println("Languages which starts with 'J':");  
        filter(languages,(str)->str.startsWith("J"));
    }

}
