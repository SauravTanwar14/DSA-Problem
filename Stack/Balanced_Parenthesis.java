package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Balanced_Parenthesis {

    public static boolean isValidOptimised(String s){
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){

            if(ch=='(' || ch=='{' ||ch=='['){
                st.push(ch);
            }else if(ch==')' && !st.isEmpty() && st.peek()=='('){
                st.pop();
            }else if(ch=='}' && !st.isEmpty() && st.peek()=='{'){
                st.pop();
            }else if(ch==']' && !st.isEmpty() && st.peek()=='['){
                st.pop();
            }else{
                return false;
            }

        }
        return st.empty();
    }

    static boolean isBalanced(String s){

        Stack<Character> st = new Stack<Character>();

        for(char c : s.toCharArray()){

            if(c =='(' || c == '[' || c == '{'){

                st.push(c);
            }
            else {
                if(st.empty() == true){
                    return false;
                }

                else if (c == ')' && st.peek() != '(')
                {
                    return false;
                }
                else if (c == ']' && st.peek() != '[')
                {
                    return false;
                }
                else if (c == '}' && st.peek() != '{')
                {
                    return false;
                }
                else{
                    st.pop();
                }

            }
           
        }

        return st.empty();

    }

    static String Balanced(String s) {
        Stack<Character> st = new Stack<>();
    
        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            }
            // Handle closing brackets
            else {
                // If the stack is empty, there's no matching opening bracket
                if (st.empty()) {
                    return "NO";
                }
    
                // Check if the top of the stack is the matching opening bracket
                if (c == ')' && st.peek() != '(') {
                    return "NO";
                } else if (c == ']' && st.peek() != '[') {
                    return "NO";
                } else if (c == '}' && st.peek() != '{') {
                    return "NO";
                } else {
                    // If matched, pop the opening bracket
                    st.pop();
                }
            }
        }
    
        // If the stack is empty, all brackets were matched
        return st.isEmpty() ? "YES" : "NO";
    }
    

     public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter a string with parentheses: ");

         //Check if there is any input available
         if (scanner.hasNextLine()) {
             String s = scanner.nextLine();
             if (isBalanced(s)) {
                 System.out.println("The parentheses in the string are balanced.");
             } else {
                 System.out.println("The parentheses in the string are not balanced.");
             }
         }
        //     if (isValidOptimised(s))
        //     {
        //         System.out.println("The parentheses in the string are balanced.");
        //     }
        //     else
        //     {
        //         System.out.println("The parentheses in the string are not balanced.");
        //     }
        // }

        // Example input
       
//        if (scanner.hasNextInt()) {
//            int t = scanner.nextInt();  // Read the number of test cases
//            scanner.nextLine();         // Consume newline character after the integer input
//
//            // Process each test case
//            for (int i = 0; i < t; i++) {
//                String s = scanner.nextLine();
//                System.out.println(Balanced(s));  // Output YES or NO
//            }
//        } else {
//            System.out.println("Invalid input! Please provide an integer for the number of test cases.");
//        }

        scanner.close();
    }
}
