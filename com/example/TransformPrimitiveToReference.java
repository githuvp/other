package com.example;
import java.util.stream.IntStream;

public class TransformPrimitiveToReference {
	public static void main(String [] args) {
		IntStream.range(1, 4) 
			.mapToObj(i -> "a" + i)
			.forEach(System.out::println);
	}
}
