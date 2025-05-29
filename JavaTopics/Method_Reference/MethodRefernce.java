package Method_Reference;

import java.util.Arrays;
import java.util.function.BiFunction;

class Arithmetic{

    public static int add(int a, int b){
        return a+b;
    }
}

class Demo{
    public static void print(String s){
        System.out.println(s);
    }
}
public class MethodRefernce {

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> adder = Arithmetic::add;

        int result =adder.apply(10, 20);

        System.out.println(result);

        String names[] ={"Alice", "Bob","Charlie"};

        Arrays.stream(names).forEach(Demo::print);
    }
}
