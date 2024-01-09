package leetcodeEasyProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

class ReversedString {
	
	void reversed(char[] s) {
		
		
		Stack<Character> st = new Stack<>();
        String str = new String(s);
        for(int i = 0; i < str.length(); i++){
            st.push(s[i]);
        }
        System.out.println("ST : "+st);
        System.out.println("str : " +str);
        char ans[] = new char[s.length];
        int i = 0;
//        System.out.println(st);
        while(st.size() > 0){
            s[i++] = st.pop();
        }
        System.out.println("S before and : "+s);
        for(char n :s) {
        	System.out.println(n);
        }
        for(int j = 0; j < str.length(); j++){
            ans[j] = str.charAt(j);
        }
        System.out.println(ans);
        
        System.out.println("S after ans : ");
        
        for(char n :s) {
        	System.out.println(n);
        }
//		char[] lst=new char[c.length];
//		for(int i=c.length-1;i>=0;i--) {
//			lst[c.length-i-1]=c[i];
//			System.out.println(c[i]);
//		}
//		
//		c=lst;
//		System.out.println(c);
		
		
		
		
//		List<Character> lst=new ArrayList();
//		for(int i=0;i<c.length;i++) {
//			lst.add(c[i]);
//		}
//		
//		Collections.reverse(lst);
//		char[] reversed=new char[c.length];
//		
//		for(int j=0;j<lst.size();j++) {
//			reversed[j]=lst.get(j);
//		}
// 		
//		return reversed;
		
	}
}


public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'h','e','l','l','o'};
		
		ReversedString rev=new ReversedString();
		rev.reversed(arr);
	}

}
