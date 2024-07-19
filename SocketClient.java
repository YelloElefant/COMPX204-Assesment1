import java.io.IOException;
import java.net.Socket;

public class SocketClient {
   public static void main(String[] args) {
      if (args.length == 0) {
         System.err.println("Usage: java SocketClient <ipaddress> <port>");
         return;
      }
      String ip = args[0];
      int port = Integer.parseInt(args[1]);
      try {
         Socket socket = new Socket(ip, port);
         byte[] response = new byte[4096];
         socket.getInputStream().read(response);
         System.out.println(new String(response).trim());

         socket.close();
      } catch (IOException e) {
         System.err.println("Unable to connect to " + ip + " on port " + port);
      }
   }
}
