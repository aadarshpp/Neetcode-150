import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // Sort the array
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int a = nums[i];
            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = a + nums[left] + nums[right];

                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    // Found a triplet
                    result.add(Arrays.asList(a, nums[left], nums[right]));

                    int leftVal = nums[left], rightVal = nums[right];
                    // Skip duplicates
                    while (left < right && nums[left] == leftVal) left++;
                    while (left < right && nums[right] == rightVal) right--;
                }
            }
        }

        return result;
    }
}
