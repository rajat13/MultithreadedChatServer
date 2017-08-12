import java.util.*;
import java.net.*;
import java.io.*;

public class chatserver{
		private final static int PORT_NUM = 2010;
		public static int nreq = 0;
		private static Dispatcher dispatcher;
		public static void main(String[] args){
			try{
			dispatcher = new Dispatcher();
			ServerSocket s = new ServerSocket(PORT_NUM);
			while(true){
				Socket newsoc = s.accept();
				DataOutputStream output = new DataOutputStream(newsoc.getOutputStream());
				nreq++;				
				output.writeUTF("Welcome to chat server" + "client no:" +nreq);
				
				ClientHandler newclient = new ClientHandler(newsoc,dispatcher,nreq);				
				dispatcher.add(newclient);
				newclient.start(); 
			}
			}catch(IOException e){
				}
		}
	}
