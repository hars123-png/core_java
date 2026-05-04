import java.util.HashSet;
import java.util.Iterator;
public class HashSetEX {
   public static void main(String[] args) {
    HashSet<String> set = new HashSet<>();
    set.add("Hello");
    
    //methods same as linked list

    //Iterator
    System.out.println("Using Iterator:");
    Iterator<String> iterator = set.iterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }

    //hashcode
      System.out.println("Hash code of set: " + set.hashCode());  
   }
}