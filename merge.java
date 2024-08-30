import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;

 class merge {
    public static void main(String args[]) {
        ArrayList<Integer> obj = new ArrayList<Integer>();
        obj.add(15);
        obj.add(5);
        LinkedList<Integer> obj1 = new LinkedList<Integer>();
        obj1.addFirst(4);
        obj1.addLast(7);
        Iterator<Integer> itr = obj.iterator();
        Iterator<Integer> it = obj1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}



