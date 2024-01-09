package leetcodeEasyProblem;

import java.util.ArrayList;
import java.util.List;

class SelfDivide{
	
	List<Integer> isDividedList(int left,int right ){
		
		List<Integer> lst=new ArrayList();
		List<Integer> self=new ArrayList();
		
		for(int i=left ;i<=right;i++) {
			lst.add(i);
		}
		for(int j=0;j<lst.size();j++) {
			for(int k=0;k<lst.size();k++) {
				int ele=lst.get(j);
				if(ele>0 && ele<=9) {
					self.add(ele);
				}else {
					int temp=0;
					int reminder=ele%10;
					while(ele>0) {
						
					}
				}
			}
		}
		
		return lst;
	}
}

public class SelfDividNumber {
	public static void main(String[] args) {
		int left =3,right=21;
		
		SelfDivide isSelf=new SelfDivide();
		
		System.out.println(isSelf.isDividedList(left, right));
		 
	}
}
