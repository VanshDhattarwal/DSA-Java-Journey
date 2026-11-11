
class Solution {
    public int longestResilientSubarray(int[] nums, int k) {
        int n = nums.length;
        int answer = 1;

        int i = 0;

        while (i < n) {
            int remainder = nums[i] % k;
            int j = i;

            while (j < n && nums[j] % k == remainder) {
                j++;
            }

            int length = j - i;
            int d = k / gcd(remainder, k);

            int candidate =
                1 + ((length - 1) / d) * d;

            answer = Math.max(answer, candidate);

            i = j;
        }

        return answer;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
