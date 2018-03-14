package com.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;


public class RaceConditionTest {

	int count =0;

	public void increment() {
		count = count + 1;
	}
	public void startss() {
	   ExecutorService executor = Executors.newFixedThreadPool(2);
		IntStream.range(0, 10000)
			 .forEach(i -> executor.submit(this::increment));
             executor.shutdown();
		System.out.println(count);
	}


			

	public static void main(String[] args) {
		RaceConditionTest rct = new RaceConditionTest ();
		    rct.startss();
	}
}
		
