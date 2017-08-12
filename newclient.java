import java.util.*;
import java.net.*;
import java.io.*;

public class newclient{
	private static final int PORT_NUM = 2010;
	public static void main(String[] args){
		try{
		Socket newsoc = new Socket("127.0.0.1",PORT_NUM);
		DataInputStream input = new DataInputStream(newsoc.getInputStream());
		DataOutputStream output = new DataOutputStream(newsoc.getOutputStream());
		Scanner scan = new Scanner(System.in);
		Thread inputthread = new inputlistenerthread(newsoc);
		Thread outputthread = new outputlistenerthread(newsoc);
		inputthread.start();
		outputthread.start();
		}catch(IOException e){
			}
	}
}
		
				
