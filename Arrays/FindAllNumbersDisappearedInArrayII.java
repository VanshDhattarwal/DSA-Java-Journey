
import java.util.*;

class Solution {
    public List<List<Integer>> findDisappearedNumbers(
        int[] nums, int lower, int upper) {

        Arrays.sort(nums);

        List<List<Integer>> answer = new ArrayList<>();

        int prev = lower - 1;

        for (int num : nums) {

            if (num < lower || num > upper) {
                continue;
            }

            if (num <= prev) {
                continue;
            }

            if (num - prev > 1) {
                answer.add(
                    Arrays.asList(prev + 1, num - 1)
                );
            }

            prev = num;
        }

        if (prev < upper) {
            answer.add(
                Arrays.asList(prev + 1, upper)
            );
        }

        return answer;
    }
}
