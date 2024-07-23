//Name : Alexander Trotter ID: 1644272

import java.net.*;
import java.util.*;

public class reverse {
   public static void main(String[] args) {
      if (args.length == 0) {
         System.err.println("Usage: java reverse <ipaddress1> <ipaddress2> ...");
         return;
      }
      (Arrays.asList(args)).forEach((arg) -> {
         resolveIpAdress(arg);
      });

   }

   public static void resolveIpAdress(String ipAdressString) {
      try {
         InetAddress address = InetAddress.getByName(ipAdressString);
         System.out.println(ipAdressString + ": " + address.getHostName());
      } catch (UnknownHostException e) {
         System.err.println(ipAdressString + ": no name");
      }
   }
}
