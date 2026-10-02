class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        // Step 1: Store frequency of elements in nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Check elements of nums2
        for (int num : nums2) {

            if (map.containsKey(num) && map.get(num) > 0) {

                // Add matching element
                result.add(num);

                // Use one occurrence
                map.put(num, map.get(num) - 1);
            }
        }

        // Step 3: Convert ArrayList<Integer> to int[]
        int[] answer = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
