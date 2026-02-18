import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int maxCount = 1;
        int currCount = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            } else if (nums[i] == nums[i - 1] + 1) {
                currCount++;
            } else {
                maxCount = Math.max(maxCount, currCount);
                currCount = 1;
            }
        }

        maxCount = Math.max(maxCount, currCount);
        return maxCount;
    }
}