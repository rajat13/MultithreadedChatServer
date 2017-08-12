import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

class Dispatcher implements Dispatch{
	CopyOnWriteArrayList<ClientHandle> dispatcher;
		
	public Dispatcher(){
		dispatcher = new CopyOnWriteArrayList<ClientHandle>();
		}	
	public void add(ClientHandle t){
			dispatcher.add(t);
		}

	public void dispatch(String s){
		if(s!=null){
				for(ClientHandle t: this.dispatcher){
					t.send(s);
				}
			}
		}
	}
