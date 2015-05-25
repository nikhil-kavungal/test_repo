package com.test.demo;

public class MyThread extends Thread {

	@Override
	public synchronized void start() {
		System.out.println("In Start");
		super.start();
	}

	@Override
	public void run() {
		System.out.println("In run");
	}

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		
	}
}
