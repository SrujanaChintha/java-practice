import java.io.*;
import java.net.*;
public class client {
    public static void main(String[] args) {
        try{
            DatagramSocket ng = new DatagramSocket();
            String msg =("hello");
            byte[] SD =msg.getBytes();
            InetAddress addr = InetAddress.getByName("localhost");
            DatagramPacket sendpacket = new DatagramPacket(SD,SD.length,addr,3002);
            ng.send(sendpacket);
            System.out.println("msg sent");
            ng.close();
        }
        catch(Exception e){
            System.out.println("error");
        }
        }
    }
    
