package leetcodeEasyProblem;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


class ListItems{
	void sortedList(List lst1 ,List lst2) {
			
		
		LinkedList<Integer> mergerdList=new LinkedList();
		int lengt=lst1.size()+lst2.size();
			for(int i=0 ;i<lst1.size();i++) {
				mergerdList.add((Integer) lst1.get(i));
				if(i==lst1.size()-1) {
					for(int j=0;j<lst2.size();j++) {
						mergerdList.add((Integer) lst2.get(j));
					}
				}
			}
			Collections.sort(mergerdList);
		
	}
}

	
	
	

public class MergeTwoSortedLists {
	
	
	public static void main(String[] args) {
		
		
		List<Integer> list1=new LinkedList<>();
		List<Integer> list2=new LinkedList<>();
		
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		ListItems sorted=new ListItems();
		
		sorted.sortedList(list1, list2);
		
		
		
	}

}
