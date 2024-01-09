package leetcodeEasyProblem;

class FindLastWord{
	int lastWord(String s) {
		
		
		StringBuffer str=new StringBuffer("");
//		System.out.println(str.length());
		int temp=0;
		for(int i =s.length()-1 ;i>=0;i--) {
			
//			System.out.println(s.charAt(i));
			char current_char=s.charAt(i);
			if(!Character.isWhitespace(current_char)) {
				str.append(current_char);
				temp++;
			}
			else if(str.length()>0 && Character.isWhitespace(current_char)) {
				
				break;
			}
			
		}		
		return str.length();
		
	}
}

public class LengthOfLastWord {
	public static void main(String[] args) {
			FindLastWord lastword=new FindLastWord();
			
			String str="   fly me   to   the moon  ";
//			System.out.println(str.length());
			lastword.lastWord(str);
	}

}
