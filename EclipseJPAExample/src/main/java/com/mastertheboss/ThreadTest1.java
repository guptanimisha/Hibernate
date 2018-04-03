package com.mastertheboss;

import java.util.Collections;

public class ThreadTest1 implements Runnable{
	Thread t;
	ThreadTest1(){
		t = new Thread(this, "ThreadTest1");
	}
	
	
	public Thread getThread(){
		return t;
	}
	
	public void run() {
		System.out.println("in thread test 1");
		
	}
	
	public static void main(String[] args) {
		
		Thread t1 = new ThreadTest1().getThread();
		t1.start();
		System.out.println("["+t1.getName()+"] Sleeping in main ←􏰀 thread for 5s...");
		try {
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("["+t1.getName()+"] Interrupting ←􏰀 myThread");
		t1.interrupt();
		
		System.out.println("Is thread interrupted:"+ t1.isInterrupted());
	}

}
