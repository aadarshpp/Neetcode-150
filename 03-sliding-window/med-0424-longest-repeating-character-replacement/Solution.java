class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int start = 0;
        int maxFreq = 0; 
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - 'A']++;

            maxFreq = Math.max(maxFreq, count[c - 'A']);

            // If replacements needed > k, shrink window
            while ((i - start + 1) - maxFreq > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            }

            maxLength = Math.max(maxLength, i - start + 1);
        }

        return maxLength;
    }
}