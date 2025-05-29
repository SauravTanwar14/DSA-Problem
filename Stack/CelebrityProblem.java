package Stack;

import java.util.Stack;

public class CelebrityProblem {

    /*Find a Celebrity Candidate:

Use two pointers: i (start) and j (end).
If M[i][j] == 1, then i knows j. So, i cannot be a celebrity. Increment i.
If M[i][j] == 0, then j cannot be a celebrity. Decrement j.
By the end of this loop, i will point to the potential celebrity.
Verify the Candidate:

Ensure that the candidate:
Does not know anyone else in the group (M[candidate][k] == 0 for all k ≠ candidate).
Is known by everyone else in the group (M[k][candidate] == 1 for all k ≠ candidate).
If the candidate passes both checks, return the candidate index; otherwise, return -1. */

public static int findCelebrity(int M[][],int n){
     // Step 1: Find the potential celebrity
     int candidate =0;
     for(int i=1;i<n;i++){

        if(M[candidate][i]==1){
            candidate=i; // Candidate knows i, so i could be the celebrity
        }
     }

     // Step 2: Verify the candidate
     for(int i=0;i<n;i++){
        if(i != candidate){

            if(M[candidate][i] == 1 || M[i][candidate] == 0)
            return -1;
        }
     }
     return candidate;
}
/*Algorithm (Stack-Based)
Push All People into a Stack:

Push all n people (indices 0 to n-1) into a stack.
Eliminate Non-Celebrities:

While the stack has more than one person:
Pop two people A and B.
Check if A knows B:
If A knows B, then A cannot be the celebrity (remove A and push B back).
Otherwise, B cannot be the celebrity (remove B and push A back).
At the end of this process, one person remains in the stack, who is the celebrity candidate.
Verify the Candidate:

Check if the remaining person satisfies the celebrity conditions:
They do not know anyone else (M[candidate][i] == 0 for all i ≠ candidate).
Everyone knows them (M[i][candidate] == 1 for all i ≠ candidate).
If both conditions are true, return the candidate index; otherwise, return -1. */

 public static int findCelebrityUsingStack(int[][] M, int n) {
        // Step 1: Push all people into a stack
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        // Step 2: Eliminate non-celebrities
        while (stack.size() > 1) {
            int A = stack.pop();
            int B = stack.pop();

            if (M[A][B] == 1) {
                // A knows B, so A cannot be the celebrity
                stack.push(B);
            } else {
                // A does not know B, so B cannot be the celebrity
                stack.push(A);
            }
        }

        // Step 3: Verify the remaining candidate
        int candidate = stack.pop();

        // Check if the candidate is a celebrity
        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                // Candidate should not know others, and everyone should know the candidate
                if (M[candidate][i] == 1 || M[i][candidate] == 0) {
                    return -1;
                }
            }
        }

        return candidate;
    }


public static void main(String[] args) {
    int[][] M = {
        {0, 1, 0},
        {0, 0, 0},
        {1, 1, 0}
    };
    int n = M.length;
    int celebrity = findCelebrity(M, n);
    if (celebrity == -1) {
        System.out.println("No celebrity found.");
    } else {
        System.out.println("Celebrity is person " + celebrity);
    }

    int celebrity2 = findCelebrityUsingStack(M, n);
    if (celebrity2 == -1) {
        System.out.println("No celebrity found.");
    } else {
        System.out.println("Celebrity is person " + celebrity2);
    }
}
}
