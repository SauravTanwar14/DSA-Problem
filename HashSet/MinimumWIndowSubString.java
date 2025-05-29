package HashSet;

import java.util.HashMap;

public class MinimumWIndowSubString {
    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        // Frequency map for characters in T
        HashMap<Character, Integer> targetMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        int required = targetMap.size(); // Number of unique characters in T
        int left = 0, right = 0;         // Sliding window pointers
        int formed = 0;                  // Tracks if the current window satisfies T
        HashMap<Character, Integer> windowMap = new HashMap<>();
        int[] result = {-1, 0, 0};       // {window length, left, right}

        while (right < s.length()) {
            char c = s.charAt(right);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

            // Check if the current character's frequency matches targetMap
            if (targetMap.containsKey(c) && windowMap.get(c).intValue() == targetMap.get(c).intValue()) {
                formed++;
            }

            // Try to shrink the window
            while (left <= right && formed == required) {
                c = s.charAt(left);

                // Update the result
                if (result[0] == -1 || right - left + 1 < result[0]) {
                    result[0] = right - left + 1;
                    result[1] = left;
                    result[2] = right;
                }

                // Remove characters from the left of the window
                windowMap.put(c, windowMap.get(c) - 1);
                if (targetMap.containsKey(c) && windowMap.get(c).intValue() < targetMap.get(c).intValue()) {
                    formed--;
                }
                left++;
            }

            // Expand the window
            right++;
        }

        return result[0] == -1 ? "" : s.substring(result[1], result[2] + 1);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println("Minimum window substring: " + minWindow(s, t));
    }
}

