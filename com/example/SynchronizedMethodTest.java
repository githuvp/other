package com.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedMethodTest {


	public static void main(String[] args) {
		System.out.println("Main started");
		Counter c = new Counter();

		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.submit(() -> {
				for(int i = 0; i < 1000; i++) c.increment();
			});
		executor.submit(() -> { 
				for(int i = 0; i<1000; i++) c.increment();
			});
		executor.shutdown();
		System.out.println("count result: " + c.getCount());
		System.out.println("Main finished, rct.count.................. ");
	}
}

class Counter {
	private int count = 0;
	ReentrantLock lock = new ReentrantLock();

	public void increment() {
		synchronized (lock) {		
		       count +=1;	
		}	
	}
	public int getCount() {
		return count;
	}
}
