package com.java.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StramAPIBasic {
	public static void main(String[] args) {
		
		
		List<Integer>  list= Arrays.asList(1,3,5,6,2,4,8,10,11);
		
		
//		Collections.sort(list);
//		System.out.print(list);
//		
		
		
		//Stream consist of many method but we are using 3 major   *Filter *map *reduce
		
		
		Stream<Integer> s1=list.stream();//creating stream object for list collection 
		
		
		
//********************************** FILTER ***********************************************//
		
										//normal method //
		
//		Predicate<Integer> p =new Predicate<Integer>() {
//
//			
//			public boolean test(Integer n) {
//				return n%2==0;
//			}
//			
//			
//		};
//		
//		s1.filter(p);
		
		//using lambda expression 
		
		Stream<Integer> s2=s1.filter( n -> n%2==0	);
		
//		ele.forEach(n -> System.out.println(n));
		
		
		
//***************************************** MAP *************************************************************//
		
		
//***************** Normal Function ************************
		
		Function<Integer, Integer>  m =new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer n) {
				
				return n*2;
			}
			
			
		};
		
		
//		Stream<Integer>   s3=s2.map(m).sorted();   passing Function object 
		
		
		Stream<Integer>   s3=s2.map(n-> n*2).sorted();
		
		// ***Lambda Expression ******//	
		
//		s2.map(n-> n*2);
 		
//****************************************************************************************************************************	

		

//***************************** forEach method ***************************//
		
//		s3.forEach(n->System.out.println(n));
		
//**********************************************************************//
		

		
//******************************* REDUCE ***************************//
		
		
		// reduce will gives the integer output 
		int s4=s3.reduce(1,(c,e)->c+e);
		
		System.out.println(s4);
		
		
	}

}
