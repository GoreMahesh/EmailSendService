package com.maheshsuji;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> values=Arrays.asList(12,24,35,46,55);

		//values.stream().forEach(System.out::println);//method reference
		System.out.println(	values.stream().filter(i->i%5==0).map(i-> i*2).reduce(0, (c,e) -> c+e));
	}

}
