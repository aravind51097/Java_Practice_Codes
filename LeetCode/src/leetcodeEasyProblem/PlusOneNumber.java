package leetcodeEasyProblem;



class SolutionPlusOneNumber{
	
	public int[] plusOne(int[] nums) {
		
		StringBuffer str_digits=new StringBuffer();
		
		for(int n :nums) {
			str_digits.append(n);
		}			
		System.out.println(str_digits);
		int digit =Integer.parseInt(str_digits.toString());
		digit=digit+1;
		System.out.println(digit);
		
		int new_arr[]=new int[nums.length];
		for(int i=nums.length-1;i>=0;i--) {
			
			if(digit>10) {
			int digit_in_increment=digit%10;
			System.out.println(digit_in_increment);
			digit=digit/10;
			new_arr[i]=digit_in_increment;
			}
			
			else {
				new_arr[i]=digit;
			}
		}
		
		
		return new_arr;
		
		
	}
	
}

public class PlusOneNumber {

	public static void main(String[] args) {
		
		
		SolutionPlusOneNumber obj =new SolutionPlusOneNumber();
		
		int a[]={29};
		
		for(int n :obj.plusOne(a)) {
			System.out.println(n);
		}
		
		
		
	}
}