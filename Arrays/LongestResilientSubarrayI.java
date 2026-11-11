
class Solution {
    public int longestResilientSubarray(int[] nums, int k) {
        int n = nums.length;
        int answer = 1;

        for (int left = 0; left < n; left++) {
            long sum = 0;
            int remainder = nums[left] % k;

            for (int right = left; right < n; right++) {
                if (nums[right] % k != remainder) {
                    break;
                }

                sum += nums[right];

                int length = right - left + 1;

                if ((sum - nums[left]) % k == 0) {
                    answer = Math.max(answer, length);
                }
            }
        }

        return answer;
    }
}
