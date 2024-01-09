package leetcodeEasyProblem;

class GetResult{
	 public int subtractProductAndSum(int n) {
	     
		 
		 int reminder=0;
		 int product =1;
		 int sum =0;
		 while(n>0) {
			 reminder=n%10;
			 product=reminder*product;
			 sum=sum+reminder;
			 n=n/10;
		 }
		 
		 int result=product-sum;
		 
		 return result;
		 
	    }
}


public class DifferenceOfProductAndAddition {
	
	public static void main(String[] args) {
		
		GetResult getRes=new GetResult();
		int res=getRes.subtractProductAndSum(329);
		System.out.println(res);
		
	}

}
