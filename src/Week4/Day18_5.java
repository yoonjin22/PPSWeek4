package Week4;

public class Day18_5 {
	class Solution {
	    int[] arr = new int[46];
	    
	    public int climbStairs(int n) {
	        arr[1] = 1;
	        arr[2] = 2;
	        for(int i=3; i<arr.length; i++) {
	            arr[i] = arr[i-1] + arr[i-2];
	        }
	        return arr[n];
	    }
	}
}
