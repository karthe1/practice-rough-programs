package com.demo.multithread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MultiThread implements Runnable {

    private int value;
    private String operation;
	
	public MultiThread(String operation, int value) {
		// TODO Auto-generated constructor stub
		this.value = value;
		this.operation = operation;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Invoked...");
		if (this.operation.equals("Addition")) {
			System.out.println("And the result is " + (this.value + this.value));
		}
	}
}

/*public class ExecuteThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService executor = null;
		try {
			executor = Executors.newFixedThreadPool(1, new DaemonFactory("JobReporter " + "Arithmetic Operation").appendThreadNumber(true).daemon(false));
			for (int i = 1; i <= 5; i++) {
				MultiThread mt = new MultiThread("Addition", 12);
				executor.execute(mt);				
			}
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executor.shutdown();
	}

}*/

class CustomException extends Exception {
	
	public CustomException() {
		// TODO Auto-generated constructor stub
		System.out.println("Exception Invoked...");
	}
	
}

public class ExecuteThreads implements Runnable {
	
	private String name;
	
	public ExecuteThreads(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		for (int i = 1; i <= 5; i++) {
				try {
					throw new CustomException();
				} catch (CustomException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(sdf.format(d) + " : " + name + " for " + i + " iteration " + Thread.currentThread().getName() + " " + this.name);			
		}
	}
	
	public static void main(String args[]) {
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for (int i = 1; i <= 5; i++) {
			executor.submit(new ExecuteThreads("Task " + i));			
		}
		executor.shutdown();
	}

}

