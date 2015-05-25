package com.test.demo;

public class MyTask implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {
			System.out.println("i = " + i);
		}

	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyTask());
		t1.start();
		t1.join();

		Thread t2 = new Thread(new MyTask());
		t2.start();
	}

}
