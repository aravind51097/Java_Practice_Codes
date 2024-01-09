package leetcodeEasyProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class OnePlus{
	
	void onePlus(int[] arr) {
		
		int last_digit=arr.length-1;
//		ArrayList<Integer> new_arr=new ArrayList();
		List new_list= Arrays.asList(arr);
		
		for(int i=0;i<new_list.size();i++) {
			if(arr.length<1) {
				
			}
			else if(arr.length==1) {
				if(arr[0]<9) {
				arr[0]=arr[0]+1;
				}
				else if(arr[0]==9) {
					new_list.add(1);
					new_list.add(0);
				}
				
			}
			else {
				if(arr[0]<arr[1]) {
					arr[last_digit]=arr[last_digit]+1;
					break;
				}
				else if(arr[0]>arr[1]) {
					arr[last_digit]=arr[last_digit]+1;
					break;
					
				}
			}
		}

		System.out.println(new_list);
	}
}
public class PlusOne {

	
	public static void main(String[] args) {
		
		
		OnePlus onePluse =new OnePlus();
//		int arr[]= {4,3,2,1};
//		int arr[]= {1};
		int arr[]= {1,2,3};
		onePluse.onePlus(arr);
		
	}
}
