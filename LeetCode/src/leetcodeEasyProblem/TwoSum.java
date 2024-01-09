package leetcodeEasyProblem;


class TwoSumOfInts{
	
	int[] sums(int[] arr ,int target) {
		
		int[] ele={0,0};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					ele[0]=i;
					ele[1]=j;
					temp++;
					break;
							}
					}
			if(temp>0) {
				break;
			}
			 
				}	
	return ele;
	
	}
	
}

public class TwoSum {
	
	public static void main(String[] args) {
		TwoSumOfInts obj=new TwoSumOfInts();
		
		int[ ] arr= {3,2,4};
		
		int[] x=obj.sums(arr, 6);
		for(int n:x) {
			System.out.println(n);
		}
		
	
	

}}
