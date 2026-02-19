class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            while (i < s.length() && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (j > -1 && !Character.isLetterOrDigit(s.charAt(j))) j--;

            if (i > j) break;

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            i++;
            j--;
        }

        return true;
    }
}
