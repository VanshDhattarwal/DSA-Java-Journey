class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int current_sum = 0;
        int count = 0;

        // Step 1: Calculate the first window
        for (int i = 0; i < k; i++) {
            current_sum = current_sum + arr[i];
        }

        // Step 2: Check the first window
        if (current_sum >= threshold * k) {
            count++;
        }

        // Step 3: Left pointer starts at the beginning
        int left = 0;

        // Step 4: Slide the window
        for (int right = k; right < arr.length; right++) {

            // Remove the element leaving the window
            current_sum = current_sum - arr[left];

            // Add the new element entering the window
            current_sum = current_sum + arr[right];

            // Check the new window
            if (current_sum >= threshold * k) {
                count++;
            }

            // Move the left pointer
            left++;
        }

        return count;
    }
}
