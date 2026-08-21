class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        // Convert k into the split index
        k = n - k;

        // Step 1: Reverse last k elements
        int right = k;
        int left = n - 1;

        while (right < left) {
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;

            right++;
            left--;
        }

        // Step 2: Reverse first part
        right = 0;
        left = k - 1;

        while (right < left) {
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;

            right++;
            left--;
        }

        // Step 3: Reverse entire array
        right = 0;
        left = n - 1;

        while (right < left) {
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;

            right++;
            left--;
        }
    }
}
