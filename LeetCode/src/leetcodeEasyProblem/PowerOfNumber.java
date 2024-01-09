package leetcodeEasyProblem;


class PowerOfTwo{
	boolean isPower(int n) {
		
						boolean isPowerOfTwo=false;
				
						if(n>=1000000){
							if(n%2==0) {
							while(n>100) {
								n=n/2;
							}	
							
							}else {
								return isPowerOfTwo;
								
							}
							}
							System.out.println(n); 
				if(n==0) {
					isPowerOfTwo=false;
				}else {
				for(int i =0;i<=n;i++) {
				if(n==1) {
					isPowerOfTwo=true;
				}
				else {
					int pow=(int)Math.pow(2, i);				
					if(pow<=n) {
						if(pow==n) {
							isPowerOfTwo=true;
							break;
						}
						else {
							isPowerOfTwo=false;
							
						}
					}else {
						break;
					}
				}
				}
				
				}
				
				return isPowerOfTwo;
		
		
		
		
		
		
		
		
//		boolean isPowerOfTwo=false;
//		if(n==0) {
//			isPowerOfTwo=true;
//		}else {
//		for(int i =0;i<=n;i++) {
//		int pow=(int)Math.pow(2, i);
//		
//		if(pow==n) {
//			isPowerOfTwo=true;
//			break;
//		}
//		else {
//			isPowerOfTwo=false;
//			
//		}
//		}
//		}
//		
//		return isPowerOfTwo;
		}
	}


public class PowerOfNumber {
	public static void main(String[] args) {
		PowerOfTwo obj=new PowerOfTwo();
		
		System.out.println(obj.isPower(1000000000));
	}

}
