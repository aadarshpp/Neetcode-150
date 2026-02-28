class TimeMap {

    private static class Pair {
        int timestamp;
        String value;
        Pair(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    private Map<String, List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        List<Pair> list = map.get(key);
        if (list == null) return "";

        int l = 0, r = list.size() - 1;
        String ans = "";

        while (l <= r) {
            int m = l + (r - l) / 2;
            Pair p = list.get(m);

            if (p.timestamp <= timestamp) {
                ans = p.value;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }
}