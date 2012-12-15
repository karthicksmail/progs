import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.String;

class server {
 public static void main ( String[] args ) throws IOException {

  // Try reading config.ini
  int portnumber =0;

  try {
   FileInputStream fstream = new FileInputStream("config.ini");
   DataInputStream fin = new DataInputStream(fstream);
   BufferedReader br = new BufferedReader( new InputStreamReader(fin));
   String strLine = br.readLine().trim();
   portnumber = Integer.parseInt(strLine);
  } catch (Exception e) {
   System.err.println(e.getMessage());
  }

  // Testing Above Block Plz comment in deployment
  //System.out.println(portnumber);

  // Trying to open Server Socket in the specified port
  ServerSocket serverSocket = null;

  try {
   serverSocket = new ServerSocket(portnumber);
   InetAddress myself = InetAddress.getLocalHost();
   System.out.println("Server Started at " + portnumber + " port on this machine (" +myself.getHostName()+")");
  } catch ( Exception e ) {
   System.err.println("ERROR 0x001 \n");
   //e.printStackTrace();
   System.exit(1);
  }

  // Open Listening Socket for client
  Socket clientSocket = null;
  while(true) {
   // Bind the Socket
   try{
    clientSocket = serverSocket.accept();
   } catch ( Exception e ) {
    System.out.println("ERROR 0x004 \n");
    continue;
   }
   System.out.println("Waiting for Input from Client.\n");
   PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
   BufferedReader in = new BufferedReader (  new InputStreamReader ( clientSocket.getInputStream() ) );

   String inputLine;
   ArrayList outputLine;
   protocol ai = new protocol();
   boolean bye = false;
   out.println("You are connected");
   while( (inputLine = in.readLine()) != null ) {
    outputLine = ai.processString(inputLine);
    //System.out.println(outputLine);
    Iterator itr = outputLine.iterator();
    while(itr.hasNext())
    {
     String inValue = (String) itr.next();
     System.out.println(" inside while " + inValue);
     out.println(inValue);
     if(inValue.equals("LATER"))
      bye = true;
    }
    if(bye == true)
     break;
   }
  }

 }
}
