//Java program to develop client connection initiation using stream sockets

//1. Importing required packgaes
import java.util.*;
import java.net.*;
import java.io.*;

class MyClient {
 public static void main(String[] args) {
DataOutputStream dos;
  Socket s = null;
  Scanner sc = new Scanner(System.in);
  
try{
   s = new Socket("localhost",6666);
System.out.println("Connection Establishing.......");
System.out.println("Connection Successful");
   dos = new DataOutputStream(s.getOutputStream());
System.out.println("Enetr the msg:");
   String sm = sc.nextLine();
dos.writeUTF(sm);
  }
  
catch(Exception e){
System.out.println("Connection failuereXcEpTiOn"+e.getMessage());
  }
  
finally{
try{
s.close();
System.out.println("Connection is closed");
   }
catch(Exception e){ 
System.out.println("Exception");
   }
  }
 }                                                                         
}

