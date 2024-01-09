package leetcodeEasyProblem;

class Counter{
	int countElement(int[] arr) {
	
		int temp = 0;
		int current_maxElement=1;
		int previous_macElement=1;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				if(current_maxElement>=previous_macElement) {
					if(arr[i]==arr[j]) {
						current_maxElement=j;
					}
				}if(current_maxElement>previous_macElement) {
					temp=current_maxElement;
					
					previous_macElement=temp;
					
					current_maxElement=previous_macElement;
				}		
			}
			
				
		} System.out.println(current_maxElement);
			System.out.println(previous_macElement);
		
	return 1;
}


}

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,1,1,2,3,4,1,2,2,2,};
		Counter obj=new Counter();
		
		obj.countElement(arr);

	}

}
