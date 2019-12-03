//A java program that establishes a simple server using stream sockets

//1. Importing required packgaes
import java.util.*;
import java.net.*;
import java.io.*;

//accept() : ServerScoketfron net package to accept conection requested by client
//getInputStream() : that reads the data from ServerSocket Object

public class MyServer {
 public static void main(String[] args) {
ServerSocket s1 = null;
  Socket s2 = null;
try{
   //ServerSocket object creation.
   s1 = new ServerSocket(6666);
System.out.println("Waiting for client request.......");
  //Accept a connection initiated by a client
   s2 = s1.accept();
System.out.println("Accepted the connection");
DataInputStream dis = new DataInputStream(s2.getInputStream());
   //Read the data and display it as output on server stream
   String rec_msg = dis.readUTF();
// The string you want to be an integer array.
String[] integerStrings = rec_msg.split(" ");
// Splits each spaced integer into a String array.
int[] integers = new int[integerStrings.length];
// Creates the integer array.
   for (int i = 0; i<integers.length; i++){
	   integers[i] = Integer.parseInt(integerStrings[i]);
//Parses the integer for each string.
   }
Arrays.sort(integers);
System.out.println("Message from client: ");
for(int i=0;i<integers.length;i++){
System.out.print(integers[i]+" ");
   }
  }
catch(Exception e){
System.out.println("eXCEPtion");
  }
finally{
   //Close the connection
try{
    s2.close();
    s1.close();
   }
catch(Exception c){
System.out.println(c);
   }
  }
 }
}

