
package leetcodeEasyProblem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



class Converting{
	
	 void converting(String s) {
		
		String romanString=s.toUpperCase();
		
		Map<String ,Integer> romanValues=new HashMap<>();
		
		romanValues.put("I", 1);
		romanValues.put("V", 5);
		romanValues.put("X", 10);
		romanValues.put("L", 50);
		romanValues.put("C", 100);
		romanValues.put("D", 500);
		romanValues.put("M", 1000);
		romanValues.put("IV", 4);
		romanValues.put("IX", 9);
		romanValues.put("XL", 40);
		romanValues.put("XC", 90);
		romanValues.put("CD", 400);
		romanValues.put("CM", 900);
		int temp=0;
		String spcl="";
		String privious="";
		int i=0;
		
		while(i<romanString.length()) {
			char element=romanString.charAt(i);
			
				if(i<romanString.length()-1) {
				char last=romanString.charAt(i+1);
				privious=String.valueOf(last);
				}
			String value=String.valueOf(element);
			spcl=value+privious;
			
			if(spcl.equals("IV") || spcl.equals("IX")||spcl.equals("XL") 
			|| spcl.equals("XC") ||spcl.equals("CD")||spcl.equals("CM")){
				temp=temp+romanValues.get(spcl);
				i+=2;				
				continue;
				
			}
			
			System.out.println("value : " + value);
			 if(value.equals("I") || value.equals("V")||value.equals("X") 
				|| value.equals("L") ||value.equals("C")||value.equals("D") ||value.equals("M")) {
				temp=temp+romanValues.get(value);
				i++;
				
				
			
			}
			
			 
		}
		
		System.out.println(temp);
	}
	
	
//	Map<Character, Integer> map = new HashMap();
//    map.put('I', 1);
//    map.put('V', 5);
//    map.put('X', 10);
//    map.put('L', 50);
//    map.put('C', 100);
//    map.put('D', 500);
//    map.put('M', 1000);
//    int res = map.get(s.charAt(s.length() - 1));
//    for(int i = s.length() - 2; i >= 0; i--) {
//        if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
//            res -= map.get(s.charAt(i));
//        } else {
//            res += map.get(s.charAt(i));
//        }
//    }
//	System.out.println();
}
public class RomanToInt {
	public static void main(String[] args) {
		
		Converting obj =new Converting();
		
		obj.converting("MCMXCIV");
		
		
	}

}
