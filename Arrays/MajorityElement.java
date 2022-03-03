package Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
    int n = nums.length;
    int count = 0;
    int current = nums[0];
    for(int i = 0; i < n; i++){
        if(count <= 0){
            current = nums[i];
            count = 0;
        }
        int x = nums[i];
        if(current == x){
            count++;
        }
        else if(current != x){
            count--;
        }
    }
    return current;
}
}
