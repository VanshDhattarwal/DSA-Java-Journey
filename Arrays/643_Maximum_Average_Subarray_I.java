class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double avg = 0;
        double max_avg = 0;
        int current_sum = 0;

        for(int i = 0 ; i <k ; i++){
            current_sum = current_sum + nums[i];
        }
        avg = (double)current_sum/k;
        max_avg = avg;

        int left = 0;
        for(int right = k ; right<nums.length; right++){
            current_sum = current_sum - nums[left];
            current_sum = current_sum + nums[right];
            left++;

            avg = (double) current_sum/k;

            if(avg>max_avg){
                max_avg = avg;

            }
           
    }
 return max_avg;
   

    }
}
