class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = piles[0];
        for (int x: piles) r = Math.max(r, x);

        while (l < r) {
            int m = (l + r) / 2;
            if (getTimeTaken(piles, m) <= h) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        return l;
    }

    private int getTimeTaken(int[] piles, int k) {
        int h = 0;
        
        for (int x: piles) {
            h += Math.ceilDiv(x, k);
        }

        return h;
    }
}
