import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListAllMethods {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // 1. add()
        list.add("Java");
        list.add("C#");
        list.add("Python");

        // addFirst/Addlast
        list.addFirst("Start");
        list.addLast("End");
        System.out.println("After add: " + list);
        
        // 2. get()
        System.out.println("get(2): " + list.get(2));
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        // 3. set()
        list.set(2, "DotNet");

        // 4. remove(index)
        list.remove();
        list.removeFirst();
        list.removeLast();
        list.remove(1);
        System.out.println("After remove: " + list);

        //contains
        System.out.println( list.contains("Java"));

        // size
        System.out.println("Size: " + list.size());

        // addAll

        LinkedList<String> List2 = new LinkedList<>();
        List2.add("Go");
        List2.add("Rust");
        list.addAll(List2);

        //removeAll
        list.removeAll(List2);

        //retainAlls
        list.retainAll(Collections.singleton("Java"));

        // queue methods
        list.offer("New");
        System.out.println("Peek: " + list.peek());
        System.out.println("Poll: " + list.poll());

        //clear
        list.clear();

        //isEmpty
        System.out.println("Is Empty? " + list.isEmpty());
    
    }
}
