import java.util.*;
import java.net.*;
import java.io.*;

public class ClientHandler  extends Thread implements ClientHandle{
	private Socket socket;
	private Dispatch dispatcher;
	private int id;

	public ClientHandler(Socket ss,Dispatch ds,int nr){
		this.socket= ss;
		this.dispatcher = ds;
		this.id =nr;
		}

	public void run(){
		try{
		DataInputStream input = new DataInputStream(socket.getInputStream());
		DataOutputStream output = new DataOutputStream(socket.getOutputStream());
		while(true){
			String line = input.readUTF();
			if(line!=null){
				dispatcher.dispatch(line);
				}
			}
		}catch(IOException e){
			}
	}

		public void send(String s){
			try{
			DataOutputStream output = new DataOutputStream(socket.getOutputStream());
			output.writeUTF(s);
			}catch(IOException e){
			}
		}
}

	

		

