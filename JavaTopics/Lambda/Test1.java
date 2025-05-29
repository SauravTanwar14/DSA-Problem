package Lambda;

interface Test11 {
    void print();  // Functional interface with a single abstract method
}

public class Test1 {

    static void fun(Test11 t1) {
        t1.print();  // Invokes the print method via the lambda
    }

    public static void main(String[] args) {
        fun(() -> System.out.println("Hello"));  // Lambda expression that implements print()
    }
}
