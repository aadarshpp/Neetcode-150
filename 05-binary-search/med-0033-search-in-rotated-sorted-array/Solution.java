import java.util.*;

class TimeMap {

    private class Pair {
        int timestamp;
        String value;

        Pair(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    Map<String, List<Pair>> map;

    public TimeMap() {
        this.map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        this.map.putIfAbsent(key, new ArrayList<>());
        this.map.get(key).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        List<Pair> list = map.get(key);
        if (list == null) return "";
        
        int l = 0;
        int r = list.size() - 1;
        String ans = "";

        while (l <= r) {
            int m = (l + r) / 2;

            if (list.get(m).timestamp <= timestamp) {
                ans = list.get(m).value;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return ans;
    }
}
