package Week4;

public class Day20_2 {

	    public int missingNumber(int[] nums) {
	        int sum = 0, arr = 0;
	        
	        for(int i=0; i<nums.length; i++) {
	            sum += i;
	            arr += nums[i];
	        }
	        
	        return sum + nums.length - arr;
	    }
}
