import java.io.*;
import java.net.*;
public class myserver {
    public static void main(String[] args) {
        try{
            DatagramSocket Dgserver = new DatagramSocket(3002);
            byte[] Data = new byte[1024];
            System.out.println("server is running");
            while(true){
                DatagramPacket receivepacket = new DatagramPacket(Data,Data.length);
                Dgserver.receive(receivepacket);
                String msg = new String(receivepacket.getData(),0,receivepacket.getLength());
                System.out.println(msg);
            } 
        }
        catch(Exception e){
            System.out.println("error");
        }
        }
    }
    
