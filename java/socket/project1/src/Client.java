import java.io.*;
import java.net.*;

public class Client {
 public static void main(String[] args) throws IOException {
  Socket socket = null;
  PrintWriter out = null;
  BufferedReader in = null;
  boolean eof = false;
  if( args.length != 2) {
   System.err.println("Usage: java Client <address> <port #>");
   System.exit(1);
  }

  String address = args[0];
  int port = Integer.parseInt(args[1]);
  try{
   socket = new Socket(address,port);
   out = new PrintWriter(socket.getOutputStream(),true);
   in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
  } catch ( UnknownHostException e) {
   System.err.println("Don't know this "+address);
   System.err.println(e.getMessage());
   System.exit(1);
  } catch ( IOException e ) {
   System.err.println("Couldnt get I/O for the connection :" + address);
   System.exit(1);
  }
  System.out.println("Connected with Server ! \n");
  FileInputStream fstream = new FileInputStream("script.txt");
  DataInputStream fin = new DataInputStream(fstream);
  BufferedReader stdIn = new BufferedReader( new InputStreamReader(fin));

  String fromServer;
  String fromUser;
  while(!eof)
  {
   while( (fromServer = in.readLine()) != null) {
    System.out.println("Server: "+fromServer);
    String[] respCheck = fromServer.split(" ");
    int countResp = 0;
    if(respCheck[0].equals("QUERY-REPLY"))
    {
     countResp = Integer.parseInt(respCheck[2]);
    }
    for(int r=0;r<countResp;r++)
    {
     System.out.println(in.readLine());
    }
    if( fromServer.equals("LATER"))
     break;
    fromUser = stdIn.readLine();
    System.out.println(fromUser);
    out.println(fromUser);
    if(fromUser == null || fromUser.equals("end"))
     eof = true;
   }
  }
  out.close();
  in.close();
  stdIn.close();
  socket.close();
  System.exit(0);
 }
}





