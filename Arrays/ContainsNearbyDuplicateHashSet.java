class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        int left = 0 ; 

        for(int i = 0 ; i< nums.length ; i++){

            if(i - left > k ){
                set.remove(nums[left]);
                left++;
            }

            if(set.contains(nums[i])){
                return true;
            }

            set.add(nums[i]);
        }

        return false;

    }
}
