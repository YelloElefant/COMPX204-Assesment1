//Name : Alexander Trotter ID: 1644272

import java.io.IOException;
import java.net.Socket;

/**
 * The SocketClient program connects to a server on a specified IP address and
 * port
 * and prints the response from the server. The program uses the Socket class to
 * connect to the server and read the response.
 */
public class SocketClient {
   /**
    * The main method connects to a server on a specified IP address and port
    * and prints the response from the server.
    *
    * @param args the IP address and port of the server
    */
   public static void main(String[] args) {
      // Check if there are no arguments and print usage message.
      if (args.length == 0) {
         System.err.println("Usage: java SocketClient <ipaddress> <port>");
         return;
      }

      String ip = args[0];
      int port = Integer.parseInt(args[1]);

      try {
         // Create a new Socket object and connect to the server on the specified IP
         // address and port.
         Socket socket = new Socket(ip, port);

         // Read the response from the server and print it.
         byte[] response = new byte[4096];
         socket.getInputStream().read(response);
         System.out.println(new String(response).trim());

         // Close the socket.
         socket.close();
      } catch (IOException e) {
         // Print an error message if the client cannot connect to the server.
         System.err.println("Unable to connect to " + ip + " on port " + port);
      }
   }
}
