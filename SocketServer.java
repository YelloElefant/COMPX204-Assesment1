import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
   public static void main(String[] args) {
      if (args.length == 0) {
         System.err.println("Usage: java SocketServer port");
         return;
      }
      int port = Integer.parseInt(args[0]);
      try {
         ServerSocket server = new ServerSocket(port);
         System.out.println("Server started on port " + port);
         while (true) {
            Socket client = server.accept();
            System.out.println("Connection from " + client.getInetAddress());
            client.close();
         }
      } catch (IOException e) {
         System.err.println("Unable to start server on port " + port);
      }
   }
}
