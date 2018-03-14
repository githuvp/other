package com.example;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;


public class ConcurrentLinkedDequeTest {
	static ConcurrentLinkedDeque<String> cld = new ConcurrentLinkedDeque<String>();

	public static void main(String[] args) {
		ExecutorService exService = Executors.newFixedThreadPool(3);
		exService.execute(() -> {
				for(int i =0; i < 50; i++) {
					cld.add("A" + i);
				}
			}
		);
		exService.execute(() -> {
				   for(int i =0; i < 25; i++) {
					String s = cld.poll();
					System.out.println("Element received is: " + s);
				    }
				}
			);
		exService.execute(() -> { 
					for(int i =0; i < 25; i++) {
						String s = cld.poll();
						System.out.println("Element recieved on is: " + s);
					}
				});
		exService.shutdown();
	}

	
}
