import java.util.LinkedList;
import java.util.Iterator;

 class main1 {
    public static void main(String args[]) {
        LinkedList<Integer> obj = new LinkedList<Integer>();
        obj.addFirst(1);
        obj.addLast(5);
        Iterator<Integer> itr = obj.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}



