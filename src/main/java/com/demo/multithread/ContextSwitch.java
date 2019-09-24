package com.demo.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1Thread implements Runnable {

	private String taskName;
	
	public Task1Thread(String taskName) {
		// TODO Auto-generated constructor stub
		this.taskName = taskName;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 10; i = i+2) {
			System.out.println( this.taskName + " started executing for even number and thread name is " + Thread.currentThread().getName() + " " +  i );
		} 
		
	}
	
}

class Task2Thread implements Runnable {

	private String taskName;
	
	public Task2Thread(String taskName) {
		// TODO Auto-generated constructor stub
		this.taskName = taskName;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 10;i = i+2) {
			System.out.println( this.taskName + " started executing for odd number and thread name is " + Thread.currentThread().getName() + " " + i );
		} 
	}
	
}

public class ContextSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		Task1Thread tt1 = new Task1Thread("Task 1");
		Task2Thread tt2 = new Task2Thread("Task 2");
		
		executor.submit(tt1);
		executor.submit(tt2);
		
		executor.shutdown();
	}

}
