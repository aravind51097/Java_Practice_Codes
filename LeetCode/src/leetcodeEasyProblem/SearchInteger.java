package leetcodeEasyProblem;

class IntSearch{
	int searchInt(int[] arr ,int target) {
		
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("x value : "+index);
			int next_index=i+1;
			System.out.println("next Index :" + next_index);
//			if(target==0) {
//				return index;
//			}
			if(arr.length<=1) {
				if(target>arr[0]) {
					return index+1;
					
				}
				else {
					return  index;
				}
			}
			 if(target<=0) { 
				 System.out.println("Current index and current array value " + i +"  & " +arr[i]);
				 if(target<arr[0]) {
					 return index;
				 }
					if(target<arr[next_index] && target>arr[i]) {
						System.out.println("Im inside ");
						 index=next_index;
						 break;
					}
					else if(target==arr[i]) {
						 index=i;
						 break;
						 
					}
					
					
			}
			else if(target<arr[0]) {
				return index;
			}
			else if(next_index<arr.length) {
				System.out.println("Current index and current array value " + i +"  & " +arr[i]);
				
				if(target<arr[next_index] && target>arr[i]) {
					System.out.println("Im inside ");
					 index=next_index;
					 break;
				}
				else if(target==arr[i]) {
					 index=i;
					 break;
					 
				}
				
			}else if(target==arr[i]) {
				 index=i;
			}
			else {
				 index=next_index;
			}
		}
		
		
		return index;
		
		
		
	}
}

public class SearchInteger {
	public static void main(String[] args) {
		
		int[] arr= {1,3,90};
		
		IntSearch obj =new IntSearch();
		System.out.println("Inex Return " + obj.searchInt(arr, 0));
	}
}
