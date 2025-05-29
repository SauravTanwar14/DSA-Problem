package IOStreams;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Please enter a interger ");

        int a= sc.nextInt();

        System.out.println("Please enter a string ");
        String st = sc.nextLine();

        System.out.printf("You have entered:- " + a + " "
                          + "and name as " + st);


    }
}
