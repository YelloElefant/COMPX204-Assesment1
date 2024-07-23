//Name : Alexander Trotter ID: 1644272

import java.net.*;
import java.util.*;

/**
 * The reverse program takes any amount of IP addresses as arguments and prints
 * the
 * corresponding hostname. If the IP address cannot be resolved, the program
 * prints "no name".
 * The program uses the resolveIpAdress method to resolve the IP address.
 */
public class reverse {
   /**
    * The main method takes any amount of IP addresses as arguments and calls the
    * resolveIpAdress method for each IP address.
    *
    * @param args the IP addresses to resolve
    */
   public static void main(String[] args) {
      // Check if there are no arguments and print usage message.
      if (args.length == 0) {
         System.err.println("Usage: java reverse <ipaddress1> <ipaddress2> ...");
         return;
      }
      // For each argument, call the resolveIpAdress method and pass it as the
      // argument.
      (Arrays.asList(args)).forEach((arg) -> {
         resolveIpAdress(arg);
      });

   }

   /**
    * The resolveIpAdress method takes an IP address as an argument and prints the
    * corresponding hostname. If the IP address cannot be resolved, the method
    * prints "no name".
    *
    * @param ipAdressString the IP address to resolve
    */
   public static void resolveIpAdress(String ipAdressString) {
      try {
         InetAddress address = InetAddress.getByName(ipAdressString);
         System.out.println(ipAdressString + ": " + address.getHostName());
      } catch (UnknownHostException e) {
         System.err.println(ipAdressString + ": no name");
      }
   }
}
