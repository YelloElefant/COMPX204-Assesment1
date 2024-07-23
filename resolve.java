//Name : Alexander Trotter ID: 1644272

import java.net.*;
import java.util.*;

public class resolve {
   public static void main(String[] args) {
      if (args.length == 0) {
         System.err.println("Usage: java resolve <hostname1> <hostname2> ...");
         return;
      }
      (Arrays.asList(args)).forEach((arg) -> {
         resolveHostnames(arg);
      });

   }

   /*
    * 
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

// The resolve program takes a hostname as an argument and prints the
// corresponding IP address. If the hostname cannot be resolved, the program
// prints an error message.
// The resolve program uses the InetAddress.getByName method to resolve the
// hostname. This method returns an InetAddress object that represents the IP
// address of the hostname. If the hostname cannot be resolved, the getByName
// method throws an UnknownHostException .
// The resolve program catches the UnknownHostException and prints an error
// message.
// Here is an example of running the resolve program:
// $ java resolve www.google.com