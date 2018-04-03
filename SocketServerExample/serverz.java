import java.io.*;
import java.net.*;

class TCPServer{
	public static void main(String argv[]) throws Exception{
	String clientSentence;
	String capitalizedSentence;
	ServerSocket welcomeSocket = new ServerSocket(36742);

	while (true) {
	  Socket connectionSocket = welcomeSocket.accept();
	  BufferedReader inFromClient = new BufferedReader(new 
InputStreamReader(connectionSocket.getInputStream()));
	  DataOutputStream outToClient = new 
DataOutputStream(connectionSocket.getOutputStream());
	  clientSentence = inFromClient.readLine();
	if(clientSentence.equalsIgnoreCase("Assalamualaikum"))
	System.out.println("Waalaikumussalam");
	else
	System.out.println("Are you a muslim");
	 // System.out.println("" +clientSentence );
	  capitalizedSentence = clientSentence.toUpperCase() + '\n';
	  outToClient.writeBytes(capitalizedSentence);
	  }
	}
}
