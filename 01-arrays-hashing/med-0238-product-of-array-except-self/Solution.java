class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Build prefix product (stored in answer array)
        answer[0] = 1; 
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Multiply by suffix product on the fly
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix; // prefix * suffix (excluding nums[i] itself)
            suffix *= nums[i];
        }

        return answer;
    }
}
