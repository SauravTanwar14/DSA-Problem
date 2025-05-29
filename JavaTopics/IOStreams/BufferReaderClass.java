package IOStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderClass {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a integer");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Enter a string");
        String b=br.readLine();

        System.out.printf("You have entered:- " + a + " "
                          + "and name as " + b);

                          // Using Console to input data from user
        String name = System.console().readLine();

        System.out.println("You entered string " + name);
    }
}
