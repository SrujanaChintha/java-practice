import java.lang.Thread;
import java.lang.*;
class sender {
    public void send(String msg) {
        System.out.println("sending " + msg);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Thread Interpted");
            }
            System.out.println(msg + " send");
        }
    }
    
    class T1 extends Thread {
        private String msg;
        sender sender;
        T1(String m, sender obj) {
            msg = m;
            sender = obj;
        }
        public void run() {
            synchronized(sender) {
                sender.send(msg);
            }
        }
    }
    
    public class Sync{
        public static void main(String[] args) {
            sender send = new sender();
            T1 obj1 = new T1("hi", send);
            T1 obj2 = new T1("bye", send);
            obj1.start();
            obj2.start();
            try {
                obj1.join();
                obj2.join();
            } catch (Exception e) {
                System.out.println("enter msg");
            }
        }
    }       
