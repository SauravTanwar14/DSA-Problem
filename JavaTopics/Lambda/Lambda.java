package Lambda;

import java.util.ArrayList;

interface Func {

    void abstractFun(int x);
    
}

interface Functional{
    int operation(int a ,int b);
}
public class Lambda {

    public static void main(String[] args) {

        Func fobj = (int x) -> System.out.println( 2*x); 
        fobj.abstractFun(5);

        /*Print number for arraylist using lambda */
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);

        al.forEach(n -> System.out.println(n));

        /*print different operatopn taking multiple parameter using lambda */
        Functional add = (x , y) -> x+y;
        Functional multiply = (a ,b) -> a * b;

        System.out.println(add.operation(6, 3));  
        System.out.println(multiply.operation(4, 5));
        
    }

}

