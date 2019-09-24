package com.demo.multithread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class Execute implements Runnable {

	@Override
	public void run() {
		System.out.println("Executed...");
		Object asd = getValue().toString();	
//		System.out.println("Executed..." + asd);
		
//		String test = null;
//		test.getBytes();
//		
	}
	
	public Object getValue() {
		return null;
	}
}

public class ExecutorServiceClass {
	
	public static void main(String args[]) {
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		ScheduledFuture future = service.scheduleAtFixedRate(new Thread(new Execute(),"Execution Thread"), 2, 10, TimeUnit.SECONDS);
		
		while (true) {
			try {
				Thread.sleep(3000);
				Object object = future.get();
				System.out.println(object);
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
			
			
		}
	}
}