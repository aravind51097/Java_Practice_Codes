package leetcodeEasyProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Common{
	String  prefix(String[] v) 
	{
//		if(arr.length>0) {
//			
//		String parent_element =arr[0];
//		if(parent_element.length()>0) {
//		int len=arr.length-1;
//		int elements =0;
//		int match=0;
//		int no_match=0;
//		
//		for(int index=0;index<arr.length;index++) {
//			
//			char current_element =parent_element.charAt(index);
//			if(no_match>=1) {
//				break;
//			}
//			for(int j=1;j<arr.length;j++) {
//				String next_word=arr[j];
//				if(no_match>=1) {
//					break;
//				}
//				for(int k=index ;k<next_word.length();k++) {
//					if(no_match>=1) {
//						break;
//					}
//					if(current_element==next_word.charAt(k)) {
//						match++;
//						break;
//					}else {
//						no_match++;
//						break;
//							
//					}	
//				}
//			}
//			
//		}
//		System.out.println("Match " +match);
//		System.out.println("No match " + no_match);
//		if(match-no_match>0) {
//			elements=(match-no_match)/len;
//			String string_matched=parent_element.substring(0, elements);
//			return string_matched;}
//		else if(match==1 && no_match==1) {
//			System.out.println("here");
//			String string_matched=parent_element.substring(0, match);
//			return string_matched;
//		}
//		else {
//			if(arr[0].length()>0){
//				if(no_match==1 && match==0) {
//					return "";
//				}
//				else {
//				return arr[0];
//				}
//				
//			}
//			else {
//				return "";
//			}
//			
//			
//		}
//		}else {
//			return "";
//			
//		}
//		
//		}
//		else {
//			return "";
//		}
		
		
		
		
		
		 StringBuilder ans = new StringBuilder();
//	        Arrays.sort(v);
	        String first = v[0];
	        String last = v[v.length-1];
	        System.out.println(Math.min(first.length(), last.length()));
	        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
	            if (first.charAt(i) != last.charAt(i)) {
	                return ans.toString();
	            }
	            ans.append(first.charAt(i));
	        }
	        return ans.toString();
	}
}


public class LongestCommonPrefix {
	public static void main(String[] args) {
		
		Common obj =new Common();
		
		String[] arr1= {"flower","fosdfsdfsdwer","sdfsdfsdf","f331211"};
		
		System.out.println(obj.prefix(arr1));
		
	}
}



//for(int index_of_element=0;index_of_element<arr.length;index_of_element++) {
//	
//	if(index_of_element+1<arr.length) {
//		 System.out.println("next : " + (index_of_element+1));
//		 next_element=arr[index_of_element+1];
//	}else {
//		 next_element=arr[index_of_element];
//		 break;
//	}
//	
//	System.out.println("Next Element  " + next_element);
//	
//	if(parent_element.charAt(index)==next_element.charAt(index_of_element)) {
//
//		System.out.println("charect : " +next_element.charAt(index_of_element));
//		
//	}
//	
//}

