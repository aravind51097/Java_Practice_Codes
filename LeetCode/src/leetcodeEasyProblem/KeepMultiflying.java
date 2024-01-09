package leetcodeEasyProblem;

class Solution {
    public int findFinalValue(int[] nums, int original) {
    	
    	
    	for(int i=0;i<nums.length;i++) {
    		System.out.println(nums[i]);
    		if(nums[i]==original) {
    			original =nums[i]*2;
    			System.out.println(original);
    			i=-1;
    			
    			
    		}
    	}
    	return original;
        
    }
}

public class KeepMultiflying {
public static void main(String[] args) {
	
	Solution sol=new Solution();
	 
	
	 String s=new String("Hitew");
	 
	System.out.println( "index of "+s.indexOf('t'));
	
	int arr[]= {8,19,4,2,15,3};
	System.out.println(sol.findFinalValue(arr, 2));
	
	
}
}
