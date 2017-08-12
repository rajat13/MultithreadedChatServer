import java.net.*;
import java.util.*;
import java.io.*;

class outputlistenerthread extends Thread{
	Socket newsoc;
	public outputlistenerthread(Socket s){
		this.newsoc = s;
		}

	public void run(){
		try{
		Scanner scan = new Scanner(System.in);
		DataOutputStream output = new DataOutputStream(newsoc.getOutputStream());
		while(true){
			String str = scan.nextLine();
			if(str!=null){
				output.writeUTF(str);
				}
			}
			}catch(IOException e){
				}
		}
	}
