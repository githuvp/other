package com.example;

import java.util.List;
import java.util.Collections;

public class TypeInference1 {

	public static void main(String[] args) {
		process(Collections.emptyList());

		List<String> list = Collections.<String>emptyList().add("some");
	}
	
	public static void process(List<String> names) {
		for(String s: names) {
			System.out.println("name: " + s);
		}
	}
}
