package com.demo.multithread;

public class MultiThreadPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		final PCThread pc = new PCThread();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}

	public static class PCThread {
		public void producer() throws InterruptedException {
			synchronized (this) {
				for (int i = 1; i <= 10;) {
					this.notify();
					System.out.println(i + " " + Thread.currentThread().getName());
					i = i + 2;
					this.wait();
				}
			}
		}

		public void consumer() throws InterruptedException {
			Thread.sleep(1000);
			synchronized (this) {
				for (int i = 0; i <= 10;) {
					this.notify();
					i = i + 2;
					System.out.println(i + " " + Thread.currentThread().getName());
					this.wait();
				}
			}
		}
	}
}
