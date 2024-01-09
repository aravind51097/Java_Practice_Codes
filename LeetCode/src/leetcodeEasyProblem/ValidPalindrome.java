package leetcodeEasyProblem;

class PalindromeString{
	boolean isValidPalindrome(String s) {
		s=s.toLowerCase();
		boolean isPalindrome=false;
		StringBuffer str=new StringBuffer();
		StringBuffer s2=new StringBuffer();
		for(int i=0;i<s.length();i++) {
			char current_char=s.charAt(i);
			if(Character.isAlphabetic(current_char) || Character.isDigit(current_char)) {
				str.append(current_char);
			}
		}
		
		for(int i=str.length()-1;i>=0;i--) {
			s2.append(str.charAt(i));
		}
		String s2_string=s2.toString();
		s2_string.trim();
		String str_string=str.toString();
		if(s2_string.equals(str_string)) {
			isPalindrome=true;
		}
		
		return isPalindrome;
	}
}

public class ValidPalindrome {
	public static void main(String[] args) {
		PalindromeString pal=new PalindromeString();
		String  s = "A man, a plan, a canal: Panama";
		System.out.println(pal.isValidPalindrome(s));
	}

}
