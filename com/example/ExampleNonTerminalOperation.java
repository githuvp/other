package com.example;
import java.util.stream.Stream;

public class ExampleNonTerminalOperation {
	public static void main(String[] args) {
		Stream.of("d2","a2", "b1", "b3", "c")
			.filter(s -> {
				System.out.println("filter: " + s); //won't print anything because it is not a terminal operation.
			return true;
		});
	}
}
