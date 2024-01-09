package leetcodeEasyProblem;


class RevesrPrfix {
    public String reversePrefix(String word, char ch) {
    	
    	StringBuffer new_str=new StringBuffer();
    	
    	int index_of_chr=word.indexOf(ch);
    	System.out.println(index_of_chr);
    	System.out.println(word.length()-1);
    	
    	for(int i=index_of_chr;i>=0;i--) {
    		
    		new_str.append(word.charAt(i));
    		
    	}
    	new_str.append(word.substring(index_of_chr+1, word.length()));
    	
    	System.out.println(new_str);
    	return new_str.toString();
        
    }
}

public class ReversePrefix {
	public static void main(String[] args) {
		
		RevesrPrfix rev1=new RevesrPrfix();
		
		String word = "abcdefd";  char ch = 'd';
		
		rev1.reversePrefix(word, ch);
				
		
	}

}
