package leetcodeEasyProblem;

import java.util.HashSet;
import java.util.Set;

class FindSingleNumber{
	int singleNumber(int arr[]){
		
		Set<Integer> unique=new HashSet();
		Set<Integer> non_unique=new HashSet();
		
		for(int i=0;i<arr.length;i++) {
			if(!unique.contains(arr[i])) {
				unique.add(arr[i]);				
			}
			else if(unique.contains(arr[i])){
				non_unique.add(arr[i]);
				unique.remove(arr[i]);
				
			}
		}

		Integer[] new_arr=unique.toArray(new Integer[unique.size()]);
		
		
		int unique_element=new_arr[0];
		System.out.println(unique_element);
		return unique_element;
		
		
	}
}

public class SingleNumber {
	public static void main(String[] args) {
		int arr[]= {4,1,2,1,2};
		
		
		FindSingleNumber obj=new FindSingleNumber();
		obj.singleNumber(arr);
	}
}
