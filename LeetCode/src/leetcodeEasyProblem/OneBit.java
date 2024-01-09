package leetcodeEasyProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class solution{
	int oneBit(int n) {
		
		String s=String.valueOf(n);
		String[] result =s.split("");
//		List<String> list=new ArrayList<>();
		int temp=0;
//		list =Arrays.asList(result);
		for(int i=0;i<result.length;i++) {
			if(Integer.parseInt(result[i])==1) {
				temp++;
				
			}
		}System.out.println(temp);
		return temp;
		
		
	}
}
public class OneBit {
	public static void main(String[] args) {
		solution obj=new solution();
		obj.oneBit(1212112);
	}

}
