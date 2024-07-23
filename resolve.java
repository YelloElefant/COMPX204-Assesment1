//Name : Alexander Trotter ID: 1644272

import java.net.*;
import java.util.*;

/*
 * The resolve program takes any amount of hostnames as arguments and prints the 
 * corresponding IP address. If the hostname cannot be resolved, the program prints "unknown host".
 */
public class resolve {
   /*
    * The main method takes any amount of hostnames as arguments and calls the
    * resolveHostnames method for each hostname.
    *
    * @param args the hostnames to resolve
    */
   public static void main(String[] args) {
      // Check if there are no arguments and print usage message.
      if (args.length == 0) {
         System.err.println("Usage: java resolve <hostname1> <hostname2> ...");
         return;
      }
      // For each argument, call the resolveHostnames method and pass it as the
      // argument.
      (Arrays.asList(args)).forEach((arg) -> {
         resolveHostnames(arg);
      });

   }

   /*
    * The resolveHostnames method takes a hostname as an argument and prints the
    * corresponding IP address. If the hostname cannot be resolved, the method
    * prints "unknown host".
    *
    * @param hostName the hostname to resolve
    */
   public static void resolveHostnames(String hostName) {
      try {
         InetAddress address = InetAddress.getByName(hostName);
         System.out.println(hostName + ": " + address.getHostAddress());
      } catch (UnknownHostException e) {
         System.err.println(hostName + ": unknown host");
      }
   }
}
