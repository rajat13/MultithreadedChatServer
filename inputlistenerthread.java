import java.util.*;
import java.net.*;
import java.io.*;

class inputlistenerthread extends Thread{
	Socket newsoc;
	public inputlistenerthread(Socket s){
		this.newsoc = s;
		}
	public void run(){
	try{
		DataInputStream input = new DataInputStream(newsoc.getInputStream());
		while(true){
			String s = input.readUTF();
			if(s!=null){
				System.out.println(s);
				}
			}
			
		}catch(IOException e){
			}
		}
	}
		
	
