class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int write = 0 ; 

        for(int read = 0 ; read < nums.length ; read++){
            if(nums[read] % 2 == 0){
                int temp = nums[read];
                nums[read] = nums[write];
                nums[write] = temp;
                write++;
            }
        }
        return nums;
        
    }
}
