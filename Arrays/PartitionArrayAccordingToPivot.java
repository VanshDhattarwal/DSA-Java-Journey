
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] answer = new int[n];

        int index = 0;

        for (int num : nums) {
            if (num < pivot) {
                answer[index++] = num;
            }
        }

        for (int num : nums) {
            if (num == pivot) {
                answer[index++] = num;
            }
        }

        for (int num : nums) {
            if (num > pivot) {
                answer[index++] = num;
            }
        }

        return answer;
    }
}
