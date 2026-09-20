import java.util.HashSet;
import java.util.ArrayList;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
         HashSet<Integer> set1 = new HashSet<>();

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                if(set.contains(nums2[i])&& !set1.contains(nums2[i])){
                     ans.add(nums2[i]);
                set1.add(nums2[i]);


                }
               
            }
        }

        int[] result = new int[ans.size()];

for (int i = 0; i < ans.size(); i++) {
    result[i] = ans.get(i);
}

return result;
    }

    
}
