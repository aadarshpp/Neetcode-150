class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        // Count frequency of s1
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }

        int left = 0;
        int right = 0;
        int requiredLength = s1.length();

        while (right < s2.length()) {
            // Add right character to window
            windowCount[s2.charAt(right) - 'a']++;
            right++;

            // If window size exceeds s1 length, remove left character
            if (right - left > requiredLength) {
                windowCount[s2.charAt(left) - 'a']--;
                left++;
            }

            // Compare arrays
            if (matches(s1Count, windowCount)) {
                return true;
            }
        }

        return false;
    }

    private boolean matches(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}