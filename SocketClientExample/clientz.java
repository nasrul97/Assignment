import java.io.*;
import java.net.*;

class TCPCLient{
	public static void main(String argv[]) throws Exception {
	  String sentence;
	  String modifiedSentence;
	  BufferedReader inFromUser = new BufferedReader(new 
InputStreamReader(System.in));
	  Socket clientSocket = new Socket("192.168.75.130", 36742);
	  DataOutputStream outToServer = new 
DataOutputStream(clientSocket.getOutputStream());
	  BufferedReader inFromServer = new BufferedReader(new 
InputStreamReader(clientSocket.getInputStream()));
	  sentence = inFromUser.readLine();
	  outToServer.writeBytes(" " +sentence + '\n');
	  modifiedSentence = inFromServer.readLine();
	  clientSocket.close();
	  }
	}
