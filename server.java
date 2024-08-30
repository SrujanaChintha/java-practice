import java.io.*;
import java.net.*;
public class server {
    public static void main(String[] args) {
        try{
            ServerSocket ss=new ServerSocket(3002);
            Socket s=ss.accept();
            Socket h=ss.accept();
            DataInputStream din=new DataInputStream(s.getInputStream());
            String str = din.readUTF();
            DataInputStream hin=new DataInputStream(h.getInputStream());
            String st = hin.readUTF();
            System.out.println("message from client"+str);
            System.out.println("message from client"+st);
            din.close();
            hin.close();
            ss.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}







    

