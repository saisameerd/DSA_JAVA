package Arrays;

public class maxAvgSubArr {

    // used sliding window
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int high=0;
        for(; high<k; high++){
            sum+=nums[high];
        }
        int max=sum;
        int low=0;
        while(high<nums.length){
            sum+=nums[high]-nums[low];
            max=Math.max(max, sum);
            low++;
            high++;
        }
        return (double)max/k;
    } 
}
