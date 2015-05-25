package com.test.staging;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A {
	// A a = new A();

	static {
		System.out.println("Statuc block 1");
	}

	public static void myMessage() {
		System.out.println("Static myMessage");
	}

	public static void main(String[] args) {
		List<String> abs = new ArrayList<String>();
		abs.add("AasaS");
		abs.add("asgndkjsg");
		abs.add("asgndkjsg1");
		abs.add("asgndkjsg3");
		abs.add("asgndkjsg4");
		abs.add("asgndkjsg3r3");
		System.out.println(abs.size());

		Iterator ie = abs.iterator();
		while (ie.hasNext()) {
			String str = (String) ie.next();
			System.out.println(str);
			abs.remove(3);
			ie.remove();
			System.out.println("Second commit");
		}
//
//		for (int i = 0; i < abs.size(); i++) {
//			System.out.println(abs.get(i));
//			abs.remove(i);
//			abs.add("Nikhil");
//		}
//		System.out.println(abs.size());
	}

}
