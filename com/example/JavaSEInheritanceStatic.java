package com.example;

abstract class Writer {
	public static void write() {
		System.out.println("Writing...");
	}
}

class Author extends Writer {
	public static void write() {
		System.out.println("Writing book");
	}
}

class Programmer extends Writer {
	public static void write() {
		System.out.println("Writing code");
	}
}

public class JavaSEInheritanceStatic {
	public static void main(String[] args) {
		Writer w = new Programmer();
		w.write();
		Programmer p = new Programmer();
		p.write();
	}
}
