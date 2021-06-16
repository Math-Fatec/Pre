package Main;

import java.lang.*;

 public class App extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Thread();
		  }
	
	public void run(){
		
		for (int i= 1; i < 4; i++) {

	         System.out.println(Thread.currentThread().getName() + "  " + i);
	         try {
	        	 
	        	Thread t2013 = new Thread();
	        	Thread t2014 = new Thread();
	        	Thread t2016 = new Thread();
	        	Thread t2017 = new Thread();
	            t2013.start();
	            t2014.start();
	            t2016.start();
	            t2017.start();
	            Thread.sleep(100);
	            
	            
	         } catch (Exception e) {
	            System.out.println(e);
	         }
	         
	         try {
	        	 
	        	Thread t2013 = new Thread();
		        Thread t2014 = new Thread();
		        Thread t2016 = new Thread();
		        Thread t2017 = new Thread();
		        t2013.join();
		        t2014.join();
		        t2016.join();
		        t2017.join();
	             
	             System.out.println("Título" + "Gênero" + "Subgênero");
	             
	         } catch (InterruptedException ex) {
	             ex.printStackTrace();
	         }

	     }
	}
		
}