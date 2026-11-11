
class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int maxProduct = Integer.MIN_VALUE;
        int[] answer = {-1, -1};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                if (i == j) {
                    continue;
                }

                if (nums[i] > nums[j] &&
                    nums[i] + nums[j] == target) {

                    int product = nums[i] * nums[j];

                    if (product > maxProduct) {
                        maxProduct = product;
                        answer[0] = i;
                        answer[1] = j;
                    }
                }
            }
        }

        return answer;
    }
}
