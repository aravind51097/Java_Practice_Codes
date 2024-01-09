package leetcodeEasyProblem;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class SortRevesr{
	void reverseSort(LinkedList lst) {
		
		
		Comparator<Integer> com=new Comparator<Integer>() {
			
			
			
			public int compare(Integer int1,Integer int2) {
				if(int1>int2) {
					return -1;
				}
				else {
					return 1;
				}
				
			}
			
		};
		
		Collections.sort(lst,com);
		System.out.println(lst);
		
		
	}
}

public class ReverseLinkedList {
	public static void main(String[] args) {
		SortRevesr sort=new SortRevesr();
		
		LinkedList<Integer> lst=new LinkedList();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		sort.reverseSort(lst);
	}
}
