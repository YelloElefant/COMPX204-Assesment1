import java.net.*;
import java.util.*;

public class reverse {
   public static void main(String[] args) {
      if (args.length == 0) {
         System.err.println("Usage: java reverse <ipaddress>");
         return;
      }
      (Arrays.asList(args)).forEach((arg) -> {
         resolveIpAdress(arg);
      });

   }

   public static void resolveIpAdress(String ipAdressString) {
      String[] ipAdressParts = ipAdressString.split("\\.");
      byte[] ipAdress = new byte[4];
      for (int i = 0; i < 4; i++) {
         ipAdress[i] = (byte) Integer.parseInt(ipAdressParts[i]);
      }
      try {
         InetAddress address = InetAddress.getByAddress(ipAdress);
         System.out.println(ipAdressString + ": " + address.getCanonicalHostName());
      } catch (UnknownHostException e) {
         System.err.println("Unable to resolve " + ipAdressString);
      }
   }
}
