package leetcodeEasyProblem;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class RemoveDups{
	
	int  removeDups(int[] nums) {
		 	Set<Integer> unique=new HashSet();		
				for(int num :nums) {
					unique.add(num);
				}
			Stack<Integer> elements_in_stack=new Stack();
				for(int num:unique) {
					elements_in_stack.push(num);
				}
			Collections.sort(elements_in_stack);
			Collections.reverse(elements_in_stack);			
			int no_of_unique_element=elements_in_stack.size();
			for(int i=0;i<no_of_unique_element;i++) {
				nums[i]=elements_in_stack.pop();
			}
			return no_of_unique_element ;
		
	}
	
	
}
public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		int nums[] = {-3,-1,0,0,0,3,3}; // Input array
		int expectedNums[] = {0,1,2,3,4}; // The expected answer with correct length

		
//		int nums[] = {0,0,1,1,1,2,2,3,3,4};
		RemoveDups dups=new RemoveDups();
		int k = dups.removeDups(nums); // Calls your implementation

		assert k == expectedNums.length;
		System.out.println(k);
		for (int i = 0; i < k; i++) {
		    assert nums[i] == expectedNums[i];
		}
		
		
	}

}
