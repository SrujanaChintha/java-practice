import java.util.ArrayList;
import java.util.Iterator;
class arraylist {
    public static void main(String args[]) {
        ArrayList<Integer> obj = new ArrayList<Integer>();
        obj.addFirst(1);
        obj.addLast(5);
        Iterator<Integer> itr = obj.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}



