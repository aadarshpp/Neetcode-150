class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] letterCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int indexOfCharFromS = s.charAt(i) - 'a';
            int indexOfCharFromT = t.charAt(i) - 'a';
            letterCount[indexOfCharFromS]++;
            letterCount[indexOfCharFromT]--;
        }

        for (int x: letterCount) {
            if (x != 0) return false;
        }

        return true;
    }
}
