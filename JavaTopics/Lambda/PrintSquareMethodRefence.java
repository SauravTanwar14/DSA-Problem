package Lambda;

import java.util.Arrays;
import java.util.List;

public class PrintSquareMethodRefence {

    public static void printSquare(int x){
        System.out.print(x*x+" ");
    }
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1,2,3,4,5);
        al.forEach(PrintSquareMethodRefence::printSquare);

    }
}
