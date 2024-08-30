import java.io.*;
import java.net.*;
public class multipleclient {
    public static void main(String[] args) {
        try{
            Socket h = new Socket("localhost",3002);
            DataOutputStream dout = new DataOutputStream(h.getOutputStream());
            dout.writeUTF("hi server");
            dout.close();
            h.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

