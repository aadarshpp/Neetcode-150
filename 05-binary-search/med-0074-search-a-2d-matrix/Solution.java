class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int t = m * n;

        int left = 0;
        int right = t - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int v = matrix[mid/n][mid%n];
            
            if (v > target) {
                right = mid - 1;
            } else if (v < target) {
                left = mid + 1;
            } else {
                return true;
            }
            
        }

        return false;
    }
}