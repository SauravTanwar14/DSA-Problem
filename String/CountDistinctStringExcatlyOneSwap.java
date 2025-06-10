package String;

/* Problem - Given a string s, return the number of distinct strings
that can be obtained by exactly one swap of two different indices (i < j).
Input: s = "geek"
Output: 6
Explanation: After one swap,
There are only 6 distinct strings possible.(i.e "egek","eegk","geek","geke","gkee" and "keeg") */

public class CountDistinctStringExcatlyOneSwap {
    public static int countStrings(String s) {
        // code here
        int n = s.length();

        // Array to count character frequencies
        int[] map = new int[26];

        // Store total distinct strings
        int ans = 0;

        // Count valid swaps by excluding repeated characters seen so far
        for (int i = 0; i < n; i++) {
            ans += (i - map[s.charAt(i) - 'a']);
            map[s.charAt(i) - 'a']++;
        }

        // Check for any duplicate character
        for (int i = 0; i < 26; i++) {
            if (map[i] > 1) {
                ans++;
                break;
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        // Input string
        String s = "geek";

        // Output the count of distinct strings after one swap
        System.out.println(countStrings(s));
    }

}
