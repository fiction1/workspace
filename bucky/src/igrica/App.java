package igrica;

import java.util.Date;
import java.util.Random;

public class App implements Runnable{
	String name;
	int time;
	Random r = new Random();

	public App(String s){
		name=s;
		time=r.nextInt(15000);
	}
	
	public void run() {
		try{
			System.out.printf("%s is sleeping for %d\n",name,time);
			Thread.sleep(time);
			System.out.printf("%s is done\n", name);
		}catch (Exception e){
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Thread t1= new Thread (new App("konj"));
		Thread t2= new Thread (new App("ovca"));
		Thread t3= new Thread (new App("koza"));
		
		
		
		t1.start();
		t2.start();
		t3.start();
		for (int i = 0; i < 15; i++) {
			System.err.println(i+". "+new Date());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}




}
