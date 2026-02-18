import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];
            if (indexMap.containsKey(required)) {
                int indexOfRequired = indexMap.get(required);
                return new int[]{indexOfRequired, i};
            }

            indexMap.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}