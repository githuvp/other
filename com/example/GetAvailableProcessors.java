package com.example;

public class GetAvailableProcessors {

	public static void main(String[] args) {
		System.out.println("This machine has: " + Runtime.getRuntime().availableProcessors());
	}
}
