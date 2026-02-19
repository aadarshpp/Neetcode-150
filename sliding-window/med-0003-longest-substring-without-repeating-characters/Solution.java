import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxCount = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If duplicate, remove from start until it's gone
            while (set.contains(c)) {
                set.remove(s.charAt(start));
                start++;
            }

            // Add current character
            set.add(c);

            // Update maxCount
            maxCount = Math.max(maxCount, set.size());
        }

        return maxCount;
    }
}
