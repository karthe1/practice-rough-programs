package com.demo.multithread;

public class InfiniteThreadContextSwitch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		final PCThread pc = new PCThread();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
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
				while (true) {
					this.notify();
					// TODO Auto-generated method stub
					System.out.println(Thread.currentThread().getName() + " : First Thread ");
					this.wait();
				}
			}
		}

		public void consumer() throws InterruptedException {
			Thread.sleep(1000);
			synchronized (this) {
				while (true) {
					this.notify();
					// TODO Auto-generated method stub
					System.out.println(Thread.currentThread().getName() + " : Second Thread ");
					this.wait();
				}
			}
		}
	}

}
