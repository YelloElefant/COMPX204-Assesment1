import java.io.IOException;
import java.net.Socket;

public class SocketClient {
   public static void main(String[] args) {
      if (args.length == 0) {
         System.err.println("Usage: java SocketClient <ipaddress> <port> <message>");
         return;
      }
      String ip = args[0];
      int port = Integer.parseInt(args[1]);
      String message = args[2];
      try {
         Socket socket = new Socket(ip, port);
         System.out.println("Connected to " + ip + " on port " + port);
         socket.getOutputStream().write(message.getBytes());
         socket.close();
      } catch (IOException e) {
         System.err.println("Unable to connect to " + ip + " on port " + port);
      }
   }
}
