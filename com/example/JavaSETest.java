package com.example;

import java.util.ArrayList;
import java.util.List;


public class JavaSETest {

	public static void main(String[] args) {
		List<Integer> elements = new ArrayList<>();
		elements.add(10);
		//elements.add(1000);
		//elements.add(100);
		int firstElmnt = elements.get(1);
		System.out.println("now this will print some number as: " + firstElmnt);
	}
}
