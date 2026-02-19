import java.util.*;

class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String s : strs) {
            // Store string length as a single char (length < 200)
            encoded.append((char) s.length());
            encoded.append(s);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int len = str.charAt(i++); // Read length and move forward
            result.add(str.substring(i, i + len));
            i += len; // Move to next string
        }
        return result;
    }
}
