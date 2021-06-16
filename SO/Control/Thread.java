package Control;

import Main.App;
import javax.swing.JOptionPane;
import java.io.*;

 public class Thread extends Thread{
	 
	 int Thread_ano;

	 Thread_ano = JOptionPane.showImputDialog(“Digite um ano entre 2013 e 2017:”);
	 
     if (Thread_ano = 2015 && Thread_ano = 2016) {
     	System.out.println("ERROR");
     	Thread_ano = JOptionPane.showImputDialog(“Digite um ano entre 2013 e 2017:”);
     }

  public Thread(){
		 
	  try {
	      DataInputStream in = new DataInputStream(new BufferedInputStream(
	        new FileInputStream("C:/Temp/netflix.xls")));
	         
	      while (in.available() != 0){
	        System.out.print((char) in.readByte());
	      }
	    } 
	    catch (IOException e){
	      System.out.println("Erro: " + e.getMessage());
	    }
	 
	    System.exit(0);
	  }
}