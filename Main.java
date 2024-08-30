import java.lang.Thread;
 class T1 implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
        System.out.println("T1 runs");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
    }
}
 class T2 implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("T2 runs");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    }
}
 }

public class Main{
public static void main(String[] args){
    T1 obj = new T1();
    Thread thread = new Thread(obj);
    thread.start();
    T2 obj2 = new T2();
    Thread thread2 = new Thread(obj2);
    thread2.start();
}
}