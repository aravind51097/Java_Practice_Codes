	package leetcodeEasyProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Dups{
	
	boolean isDuplicate(int arr[],int target) {
		boolean isDup=false;
//		Arrays.sort(arr);
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(target==arr[i]) {
				count++;
			}
			
			if(count>1) {
				isDup=true;
				break;
			}
		}
		
		return isDup;
		
		
		
		
		
		
		
		
		
		
		
		
		
//		boolean isDup=false;
//		int temp=0;
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("Temp :" +temp);
//			System.out.println(i);
//			for(int j=i+1;j<arr.length;j++) {
//				System.out.println("j : "+j);
//				if(arr[i]==arr[j]) {
//					isDup=true;
//					temp++;
//					break;
//				}
//				else if(arr[i]!=arr[j]) {
//					isDup=false;
//				}
//			}
//			if(temp>0){
//				break;
//			}
//			
//			
//		}
//		
//		return isDup;
//		
	}
	
}

public class CantainsDups {
	
	public static void main(String[] args) {
		
		int arr[]= {1,0,1,1};
		
		Dups obj=new Dups();
		
		System.out.println(obj.isDuplicate(arr,3));
		
	}

}
