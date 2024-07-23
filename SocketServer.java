//Name : Alexander Trotter ID: 1644272

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * The SocketServer program listens on a specified port and sends a response to
 * the client
 * with the client's hostname and IP address. The program uses the ServerSocket
 * class to
 * listen on the specified port and the Socket class to send the response to the
 * client.
 */
public class SocketServer {
   /**
    * The main method listens on the specified port and sends a response to the
    * client with
    * the client's hostname and IP address.
    *
    * @param args the port to listen on
    */
   public static void main(String[] args) {
      // Check if there are no arguments and print usage message.
      if (args.length == 0) {
         System.err.println("Usage: java SocketServer <port>");
         return;
      }

      int port = Integer.parseInt(args[0]);

      try {
         // Create a new ServerSocket object and listen on the specified port.
         ServerSocket server = new ServerSocket(port);
         System.out.println("Listening on port " + port);

         // Accept incoming connections and send a response to the client with the
         // client's
         while (true) {
            Socket client = server.accept();

            String clientHostName = client.getInetAddress().getHostName();

            // Create the response message.
            String response = "Hello, " + clientHostName + ".\nYour Ip address is "
                  + client.getInetAddress().getHostAddress() + ".\n";

            // Send the response to the client.
            client.getOutputStream().write(response.getBytes());

            client.close();
         }
      } catch (IOException e) {
         // Print an error message if the server cannot start on the specified port.
         System.err.println("Unable to start server on port " + port);
      }
   }
}
