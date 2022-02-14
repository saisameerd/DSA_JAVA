package Arrays;

import java.util.*;

public class findAlone {
    public List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
            if(i - 1 >= 0 && ( nums[i - 1] + 1 == nums[i] || nums[i - 1] == nums[i])){
                continue;
            }
            
            if(i + 1 <= nums.length - 1 && (nums[i + 1] == nums[i] + 1 || nums[i + 1] == nums[i])){
                continue;
            }
            
            ans.add(nums[i]);
        }
        
        return ans;
    } 
}
