class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

       // STEP 1: Build the HashMap
for (int i = 0; i < nums1.length; i++) {
    for (int j = 0; j < nums2.length; j++) {
        int sum = nums1[i] + nums2[j];
        map.put(sum, map.getOrDefault(sum, 0) + 1);
    }
} 


for (int x = 0; x < nums3.length; x++) {
    for (int y = 0; y < nums4.length; y++) {
        int sum2 = nums3[x] + nums4[y];

        int target = -sum2;
        if(map.containsKey(target))
        count+= map.get(target);
      
    }
}

    return count;
}
}
