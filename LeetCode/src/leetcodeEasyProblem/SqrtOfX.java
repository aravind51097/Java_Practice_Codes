package leetcodeEasyProblem;


class Root{
	int squareRoot(int x) {
		int sqrt=(int)Math.sqrt(x);
		System.out.println(sqrt);
		return sqrt;
	}
}

public class SqrtOfX {

	public static void main(String[] args) {
		
		Root obj =new Root();
		
		System.out.println(obj.squareRoot(8));
		
		
	}
	
}
