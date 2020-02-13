package com.java8.stream;

import java.util.stream.Stream;

public class StreamBuilders {
	public static void main(String[] args) {
		//Stream<Integer> str=new Stream.of
		  Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
	         stream.forEach(p -> System.out.println(p));
	        
	}

}
