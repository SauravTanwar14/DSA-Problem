package Lambda;

public class RunnableExample {

    public static void main(String[] args) {

        //using anyomous class
        // Runnable task = new Runnable() {

        //     @Override
        //     public void run() {
        //         System.out.println("Task is running");
        //     }
        // };

        //using lambda expression
        Runnable task = () -> System.out.println("task is running");

        Thread thread = new Thread(task);
        thread.start();

    }
}
