class T1 implements Runnable {
    public void run() {
        System.out.println("T1 runs");
    }
}

class T2 implements Runnable {
    public void run() {
        System.out.println("T2 runs");
    }
}

public class MyThread {
    public static void main(String[] args) {
        T1 obj1 = new T1();
        T2 obj2 = new T2();
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        
        t1.start();
        t2.start();
    }
}