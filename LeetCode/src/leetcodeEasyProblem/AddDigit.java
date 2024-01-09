package leetcodeEasyProblem;



class Digits{
	int addDigits(int num) {
		
		if(num==0) {
			return 0;
		}else if(num<=9) {
			return num;
		}else {
			int digits=0;
			while(num>0) {
				int reminder=num%10;
				digits=digits+reminder;
				num=num/10;
			}
			return addDigits(digits);
		}
	}
}


public class AddDigit {
	public static void main(String[] args) {
		
		Digits adding=new Digits();
		int num=38;
		System.out.println(adding.addDigits(num));
		
	}

}
