package day_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class FirstNonReapeatChar{
	
	void nonRepeat(String str) {
		
		Set<Character> repeating = new HashSet<>();
		List<Character> nonRepeating = new ArrayList<>();
		
		for(int i=0;i<str.length();i++) {
			
			char letter =str.charAt(i);
			
			if(repeating.contains(letter)) {
				continue;
			}
			else if(nonRepeating.contains(letter)) {
				nonRepeating.remove((Character)letter);
				repeating.add(letter);	
				
			}else {
				nonRepeating.add(letter);
			}
			
		}
		System.out.println("Repeating elements : "+repeating);
		System.out.println("Non repeatig elements :" +nonRepeating);
		
		if(!nonRepeating.isEmpty())
			System.out.println("First Non repeating character : "+nonRepeating.get(0));
				
			
		}
		
		
	
}

public class nonRepeatingChar {
	public static void main(String[] args) {
		
		FirstNonReapeatChar obj=new FirstNonReapeatChar();
		
		obj.nonRepeat("aabbcvbh");
		
	}

}
